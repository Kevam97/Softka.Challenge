package Entidades;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Juego {
	private int id;
	private Pista pista;
	private ArrayList<Jugador>jugadores = new ArrayList<Jugador>();
	private ArrayList<Jugador>Ganadores = new ArrayList<Jugador>();
	private Podio podio;
	private ArrayList<String>resultado = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	public Juego() {
		
	}
	
	public Juego(int id, Pista pista, ArrayList<Jugador> jugadores) {
		super();
		this.id = id;
		this.pista = pista;
		this.jugadores = jugadores;
		this.podio = null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Podio getPodio() {
		return podio;
	}
	public void setPodio(Podio podio) {
		this.podio = podio;
	}
		
	public ArrayList<Jugador> getGanadores() {
		return Ganadores;
	}
	public void setGanadores(ArrayList<Jugador> ganadores) {
		Ganadores = ganadores;
	}
	
	public void lanzarDado(Jugador j) {		
		int recorrido = (r.nextInt(5)+1)*100;
		j.AcumaldoRecorrido(recorrido);
	}
	public void iniciarJuego() {
		while(true) {			
			for(Jugador j : this.jugadores) 
				lanzarDado(j);				
			if(asignarPodio()) break;	
		}
		asignarGanadores();
	}
	public boolean asignarPodio() {
		
		for(int i = 0; i < jugadores.size(); i++)
			if (jugadores.get(i).getRecorrido()  >= pista.getDistancia()) {
				Ganadores.add(jugadores.get(i));
				jugadores.remove(jugadores.get(i));
				if(jugadores.size() == 0)
					return true;				
			}
			return false;
	}
	public void asignarGanadores() {
		podio = new Podio(pista, Ganadores);
		podio.mostrarResultados(this.id, resultado);
		System.out.println("¿Desea hacer otra ronda?");
		System.out.println("1. Si");
		System.out.println("2. No");
		int op = sc.nextInt();
		if(op == 1) {
			this.id++;
			for(int i = 0; i < Ganadores.size(); i++) {
				jugadores.add(Ganadores.get(i));
				Ganadores.remove(Ganadores.get(i));
			}			
			for(int i = 0; i < jugadores.size(); i++) {
				jugadores.get(i).setRecorrido(0);;
			}
			iniciarJuego();
		}
	}

	
}

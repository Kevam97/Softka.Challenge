package Entidades;

import java.util.ArrayList;

public class Podio {
	private Pista pista;
	private ArrayList<Jugador>jugadores = new ArrayList<Jugador>();
	
	public Podio(Pista pista, ArrayList<Jugador> jugadores) {
		this.pista = pista;
		this.jugadores = jugadores;
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
	public void mostrarResultados(int idJuego, ArrayList<String>podio ) {
		int i = 0;
		for(Jugador j : jugadores) {
			i++;
			String info =("En el juego(id) "+idJuego+" Puesto "+i+" Jugador "+j.getNombre()+" con el conductor "+j.getConductor().getNombre()+" con el carro de "+j.getConductor().getCarro().getMarca()+"\n");
			System.out.print(info);
			podio.add(info);
			if (i == 3) break;
		}
		Datos texto = new Datos();
		texto.archivoTexto(podio);
			
	}		
}

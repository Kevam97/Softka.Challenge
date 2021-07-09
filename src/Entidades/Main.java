package Entidades;

import java.util.*;

public class Main {

	public static ArrayList<Pista> Pistas = new ArrayList<Pista>();
	public static ArrayList<Conductor> Conductores = new ArrayList<Conductor>();
	public static ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void cargueInicial() {
		Pista pista1 = new Pista(5000, 3, 1);
		Pista pista2 = new Pista(10000, 4, 2);
		Pista pista3 = new Pista(15000, 5, 3);

		Pistas.add(pista1);
		Pistas.add(pista2);
		Pistas.add(pista3);

		Carro Mercedez = new Carro("Mercedez");
		Carro Alpine = new Carro("Alpine");
		Carro Haas = new Carro("Haas");
		Carro AlfaRomeo = new Carro("AlfaRomeo");
		Carro RedBull = new Carro("RedBull");

		Conductor conductor1 = new Conductor(1, "LEWIS HAMILTON", Mercedez);
		Conductor conductor2 = new Conductor(2, "ESTEBAN OCON", Alpine);
		Conductor conductor3 = new Conductor(3, "NIKITA MAZEPIN", Haas);
		Conductor conductor4 = new Conductor(4, "ANTONIO GIOVINAZZI", AlfaRomeo);
		Conductor conductor5 = new Conductor(5, "SERGIO PEREZ", RedBull);

		Conductores.add(conductor1);
		Conductores.add(conductor2);
		Conductores.add(conductor3);
		Conductores.add(conductor4);
		Conductores.add(conductor5);

	}	
	public static Pista elegirPista() {
		System.out.println("Seleccione una pista");
		for (Pista p : Pistas) System.out.println(p.toString());
		int idPista = sc.nextInt();
		Pista pEscogida = null;
		for (Pista p : Pistas) 
			if (idPista == p.getId())
				pEscogida = p;		
		return pEscogida;
	}	
	public static void exeJugador(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Escriba su nombre jugador");
			String nombre = sc.next();
			System.out.println("Seleccione un conductor");
			for (Conductor c : Conductores)
				System.out.println(c.toString());
			int idConductor = sc.nextInt();
			Conductor c = null;
			for (Conductor p :Conductores) 
				if (idConductor == p.getId()) {
					c = p;
					Conductores.remove(p);
					break;
				}			
			Jugador j = new Jugador(nombre, i, c);
			Jugadores.add(j);
		}		
	}
	public static void main(String[] args) {
		cargueInicial();		
		Pista pEscogida = elegirPista();
		System.out.println("Inserte el nombre de los " + pEscogida.getCarriles() + " jugadores");
		exeJugador(pEscogida.getCarriles());
		int i = 1;
		Juego exe = new Juego(1, pEscogida, Jugadores);

		exe.iniciarJuego();
	
		System.out.println("¿Desea ver los resultados?");
		System.out.println("1. Si");
		System.out.println("2. No");
		int op = sc.nextInt();
		if(op == 1) {
			Datos lectura = new Datos();
			lectura.Leer();
			System.gc();
			System.exit(0);
		}else {
			System.exit(0);
		}
		
	}

}
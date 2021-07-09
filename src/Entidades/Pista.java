package Entidades;

public class Pista {
	
	private int distancia;
	private int carriles;
	private int id;

	public Pista (int pdistancia, int pCarriles, int pId) {
		this.distancia = pdistancia;
		this.carriles = pCarriles;
		this.id =  pId;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getCarriles() {
		return carriles;
	}

	public void setCarriles(int carriles) {
		this.carriles = carriles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + ".Pista con una distancia de " + distancia/1000 + " km con "+ carriles + " carriles";
	}
	
	

	
}

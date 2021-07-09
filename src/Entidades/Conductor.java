package Entidades;

public class Conductor {
	private int id;
	private String nombre;
	private Carro carro;
	
	public Conductor(int id, String nombre, Carro carro) {
		this.id = id;
		this.nombre = nombre;
		this.carro = carro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	@Override
	public String toString() {
		return id + ". Conductor " + nombre + ", carro=" + carro.getMarca();
	}
	

}

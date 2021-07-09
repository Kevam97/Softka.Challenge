package Entidades;

public class Jugador {
	private String nombre;
	private int id;
	private Conductor conductor;
	private int recorrido;
	
	public Jugador(String pNombre,int pId, Conductor conductor) {
		this.nombre = pNombre;
		this.id = pId;
		this.conductor = conductor;
		this.recorrido = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}
	
	public int getId() {
		return id;
	}
		
	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public void setId(int pId) {
		this.id = pId;
	}

	public int getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}
	
	public void AcumaldoRecorrido(int valor) {
		this.recorrido += valor;		
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", id=" + id + ", conductor=" + conductor + ", recorrido=" + recorrido
				+ "]";
	}
	
}

package zooAnimales;

public class Pez extends Animal {
	private Pez listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		super();
	}
	
	public Pez(Pez listado, int salmones, int bacalaos, String colorEscamas,int cantidadAletas) {
		this.listado=listado;
		this.salmones=salmones;
		this.bacalaos=bacalaos;
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	
public int cantidadPeces() {
		
	}
	
	public void movimiento() {
		
	}
	
	public Reptil crearSalmones() {
		
	}
	
	public Reptil crearBacalaos() {
		
	}
}

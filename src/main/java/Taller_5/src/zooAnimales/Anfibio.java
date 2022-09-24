package zooAnimales;

public class Anfibio extends Animal {
	private Anfibio listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
	}
	
	public Anfibio(Anfibio listado,int ranas, int salamandras,String colorPiel,boolean venenoso) {
		this.listado=listado;
		this.ranas=ranas;
		this.salamandras=salamandras;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
public int cantidadAfibios() {
		
	}
	
	public void movimiento() {
		
	}
	
	public Reptil crearRanas() {
		
	}
	
	public Reptil crearSalamandras() {
		
	}
}

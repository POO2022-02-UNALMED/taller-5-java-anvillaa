package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez(Pez[] listado, int salmones, int bacalaos, String colorEscamas,int cantidadAletas) {
		super();
		this.listado=listado;
		this.salmones=salmones;
		this.bacalaos=bacalaos;
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	
public int cantidadPeces() {
		return salmones+bacalaos;
	}
	
	public void movimiento() {
		
	}
	
	public Reptil crearSalmones() {
		
	}
	
	public Reptil crearBacalaos() {
		
	}
}

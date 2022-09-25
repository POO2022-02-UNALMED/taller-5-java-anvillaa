
package zooAnimales;
import java.util.ArrayList;


public class Anfibio extends Animal {
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	
	public Anfibio(Anfibio[] listado,int ranas, int salamandras,String colorPiel,boolean venenoso) {
		super();
		this.listado=listado;
		this.ranas=ranas;
		this.salamandras=salamandras;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	
public int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public void movimiento() {
		
	}
	
	public Reptil crearRanas() {
		
	}
	
	public Reptil crearSalamandras() {
		
	}
}

package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero(Mamifero[] listado, int caballos, int leones, boolean pelaje,int patas){
		super();
		this.listado = listado; 
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero() {
	
	}
	
	public int cantidadMamiferos() {
		return caballos+leones;
	}
	
	public Mamifero crearCaballo() {
		
	}
	
	public Mamifero crearLeon() {
		
	}
}

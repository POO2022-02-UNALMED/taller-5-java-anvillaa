package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil(Reptil[] listado, int iguanas,int serpientes, String colorEscamas,int largoCola) {
		super();
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpientes = serpientes;
		this.colorEscamas=colorEscamas;
		this.largoCola = largoCola;
	}
	
	public int cantidadReptiles() {
		return iguanas+serpientes;
	}
	
	public void movimiento() {
		
	}
	
	public Reptil crearIguanas() {
		
	}
	
	public Reptil crearSerpientes() {
		
	}
}

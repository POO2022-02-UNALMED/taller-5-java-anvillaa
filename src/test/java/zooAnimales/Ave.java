package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	
	public Ave(Ave[] listado,int halcones,int aguilas,String colorPlumas) {
		super();
		this.listado = listado;
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas=colorPlumas;
	}
	
	public int contarAves() {
		return aguilas+halcones;
	}
	
	public void movimiento() {
		
	}
	
	public Ave crearHalcon() {
		
	}
	
	public Ave crearAguila() {
		
	}
}

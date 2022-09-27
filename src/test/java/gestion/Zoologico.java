package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zona= new ArrayList<Zona>();

//construcción del constructor para zoologico
    
    Zoologico(String nombre,String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }
    
    Zoologico(){
    	super();
    }
    
    public void agregarZonas(Zona z) {
    	zona.add(z);
    }
    
    public int cantidadTotalAnimales() {
    	int total=0;
    	for (int i = 0; i <zona.size();i++)
    		total += zona.get(i).cantidadAnimales();
    	return total;
    }
}
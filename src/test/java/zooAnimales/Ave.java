package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private ArrayList<Ave>  listado= new ArrayList<Ave>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    Ave(String nombre,int edad,String habitat,String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
    }
    Ave(){
        
    }
    
    public String movimiento() {
    	return "volar";
    }
    
}

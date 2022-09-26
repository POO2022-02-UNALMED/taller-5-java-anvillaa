package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private ArrayList<Ave>  listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    Ave(String nombre,int edad,String habitat,String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;
    }
    Ave(){
        
    }
     
}

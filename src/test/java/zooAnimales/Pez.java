package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private ArrayList<Pez> listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    
    Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
    }

    Pez(){
        
    }
    
}

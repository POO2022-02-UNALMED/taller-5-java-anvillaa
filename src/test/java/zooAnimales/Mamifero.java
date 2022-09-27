package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private ArrayList<Mamifero>  listado = new ArrayList<Mamifero>();
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;
//constructor con los atributos heredados y de instancia
    Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
    }
//constructor vacio
    Mamifero(){
    	super();
    } 
    
}

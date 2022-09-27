package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animal;

    Zona(String nombre,Zoologico zoo,ArrayList<Animal> animal){
        this.nombre=nombre;
        this.zoo=zoo;
        this.animal=animal;
    }

    Zona(){
        
    }
}

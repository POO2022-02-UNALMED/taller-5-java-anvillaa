package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animal= new ArrayList<Animal>();

    Zona(String nombre,Zoologico zoo,ArrayList<Animal> animal){
        this.nombre=nombre;
        this.zoo=zoo;
        this.animal=animal;
    }

    Zona(){
        super();
    }
    
    public void agregarAnimales(Animal a) {
    	animal.add(a);
    }
    
    public int cantidadAnimales() {
    	animal.size();
    }
    
    
}

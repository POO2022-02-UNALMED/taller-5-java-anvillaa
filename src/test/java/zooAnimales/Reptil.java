package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    Reptil(String nombre,int edad,String habitat,String genero, String colorEscamas,int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola = largoCola;
    }

    Reptil(){
        
    }
     
}

package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
   private ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
   public int ranas;
   public int salamandras;
   private String colorPiel;
   private boolean venenoso;

   Anfibio(String nombre,int edad,String habitat,String genero, String colorPiel,boolean venenoso){
      super(nombre,edad,habitat,genero);
      this.colorPiel=colorPiel;
      this.venenoso = venenoso;  
   }
   Anfibio(){
	   super();  
   }
   
   public String movimiento(){
	   return "saltar";
   }
   
   public static Anfibio crearRana(String nombre,){
	   
   }
   
}

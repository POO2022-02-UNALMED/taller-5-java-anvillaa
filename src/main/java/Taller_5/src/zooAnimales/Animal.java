package zooAnimales;

import gestion.Zona;

public class Animal {
	private int totalAnimal;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(int totalAnimal, String nombre, int edad, String habitat, String genero,Zona zona) {
		this.totalAnimal = totalAnimal;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public Animal() {
		
	}
	
	public void moviento() {
		
	}
	
	public int totalPorTipo() {
		
	}
	
	public String toString() {
		
	}
}

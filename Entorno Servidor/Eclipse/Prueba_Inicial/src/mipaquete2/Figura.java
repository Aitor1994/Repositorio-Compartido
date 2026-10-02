package mipaquete2;

public abstract class Figura {

	//Atributo 
	private String color;
	
	//Constructor
	public Figura(String color) {
		this.color = color;
	}
	
	//get y set
	public String getColor() {
		return color;
	}

	//Metodos
	public abstract double area();
	public abstract double perimetro();

	// To String
	@Override
	public String toString() {
		return " color " + color + " ";
	}
	
	
}

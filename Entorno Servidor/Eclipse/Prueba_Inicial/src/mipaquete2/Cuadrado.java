package mipaquete2;

public class Cuadrado extends Figura {

	private int lado;
	
	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double area() {
		return this.lado * this.lado;
	}

	@Override
	public double perimetro() {
		return this.lado * 4;
	}

	@Override
	public String toString() {
		return "El cuadrado de " + super.toString() + " y su lado mide " + lado;
	}

	
}

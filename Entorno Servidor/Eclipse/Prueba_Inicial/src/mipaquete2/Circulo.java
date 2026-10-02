package mipaquete2;

public class Circulo extends Figura {

	private double PI;
	private int radio;
	
	public Circulo(String color, double PI, int radio) {
		super(color);
		this.PI = PI;
		this.radio = radio;
		
	}

	@Override
	public double area() {
		return this.PI * this.radio * this.radio;
	}

	@Override
	public double perimetro() {
		return 2 * PI * this.radio;
	}
	
	@Override
    public String toString() {
        return "El círculo de " + super.toString() + " tiene un radio de " + this.radio + ".";
    }
}

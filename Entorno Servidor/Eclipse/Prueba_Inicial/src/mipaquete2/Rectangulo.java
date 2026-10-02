package mipaquete2;

public class Rectangulo extends Figura {

	private int altura;
	private int base;
	
	public Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.base * this.altura;
	}

	@Override
	public double perimetro() {
		return (2 * this.base) + (2 * this.altura);
	}

	 @Override
	    public String toString() {
	        return "El rectángulo de " + super.toString() + " tiene una base de " + this.base + " y una altura de " + this.altura + ".";
	    }
}

package mipaquete2;

public class Test {

	public static void main(String[] args) {

		Cuadrado cuadrado1 = new Cuadrado("Rojo", 10);
		
		System.out.println(cuadrado1);
		
		System.out.println(cuadrado1.area());
		
		Rectangulo rectangulo1 = new Rectangulo("Azul", 5, 8);

		System.out.println(rectangulo1);
		System.out.println(rectangulo1.area());


		// --- PRUEBA DEL CÍRCULO ---
		// Creamos un círculo verde con un radio de 4.5
		Circulo circulo1 = new Circulo("Verde", 4.5, 2);

		System.out.println(circulo1);
		System.out.println(circulo1.area());   
		
	}

}

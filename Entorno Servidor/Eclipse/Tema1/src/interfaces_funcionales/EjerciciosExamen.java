package interfaces_funcionales;

import java.util.function.Supplier;

public class EjerciciosExamen {

	public static void main(String[] args) {

		Supplier<String>lambda1a = () -> "Hola mundo";
		System.out.println(lambda1a.get());
		
		
	}

}

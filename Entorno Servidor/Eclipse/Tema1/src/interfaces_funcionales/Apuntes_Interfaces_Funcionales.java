package interfaces_funcionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Apuntes_Interfaces_Funcionales {

	public static void main(String[] args) {
		//SON INTERFACES QUE YA TIENE JAVA
		//En la hoja de apuntes tenemos las interfaces definidas las variables que entran los que salen y como se llama 
		//metodo que tiene para poder usarla (EN EL CASO DE PREDICATE ES 'TEST').
		
		Predicate<String> masDe4Letras =
				(String s) -> {return s.length() > 4;};
				//ABREVIADA: s -> s.length() > 4;
				
				System.out.println(masDe4Letras.test("Hola"));
				
		//Otro ejemplo de predicate
				Predicate<Integer> positivo = n -> n > 0;
				System.out.println(positivo.test(-14));

				
		//Se puden usar interfaces como parametro de otra interface
				List<Integer> lista = new ArrayList<Integer>();
				lista.add(4);
				lista.add(-5);
				lista.add(0);
				System.out.println(lista);
			//al removeif (Le podemos meter la otra interface (PREDICATE) que deuvleve un boolean:
				lista.removeIf(positivo);
				System.out.println(lista);
				
				lista.removeIf(n -> n < 0);
				System.out.println(lista);
				
		//Consumer (le ponemos un strin delante "" para que no sume los numeros.
				Consumer<Integer> imprimir3veces = n -> System.out.println("" +n + n + n);
				
				imprimir3veces.accept(9);
				
				//Podemos usar el consumer para usarlo apra imprimir la lista por ejemplo :
				lista.forEach(imprimir3veces);
	}

}

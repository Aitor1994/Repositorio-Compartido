package interfaces_funcionales;

public class Test1 {

	public static int cuadrado(int numero) {
		return numero * numero;
	}
	
	public static int cubo(int numero) {
		//return  Math.pow(numero, 3); MATH.POW DEVUELVE SIEMPRE UN DOUBLE.
		return numero * numero * numero;
	}
	
	public static int doble(int numero) {
		return numero * 2;
	}
	
	public static int triple(int numero) {
		return Test1.doble(numero) * 3;
	}
	
	public static int polinomio(int numero) {
		return 5 * Test1.cubo(numero) + 7 * Test1.cuadrado(numero) + 9 ;
	}
	
	public static int polinomioVariable(int numero, int numero2, int numero3, int numero4) {
		return numero * Test1.cubo(numero4) + numero2 * Test1.cuadrado(numero4) + numero3;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Test1.cuadrado(5));		
		System.out.println(Test1.polinomio(2));
		System.out.println(Test1.polinomioVariable(2, 3, 4, 5));
		
		//A partir de AQUI no usamos el metodo sino la interfaz EntraIntSaleInt:
		EntraIntSaleInt cuadradoFI = w -> w * w;
		System.out.println(cuadradoFI.opera(1));
		
		EntraIntSaleInt cubo = w -> w * w * w;
		System.out.println(cubo.opera(5));
		
		EntraIntSaleInt doble = w -> w * 2;
		System.out.println(doble.opera(2));
		
		EntraIntSaleInt triple = w -> w * 3;
		System.out.println(triple.opera(2));
		
		EntraIntSaleInt polinomio = w -> 5 * cubo.opera(w) + 7 * cuadradoFI.opera(w) + 9;
		System.out.println(polinomio.opera(2));
		
		//Uso la interfaz anterior para calcular el cubo y el cuadrado:
		Entra4SaleInt polinomioVariable = (a, b, c, d) -> a * cubo.opera(d) + b * cuadradoFI.opera(d) + c;
		System.out.println(polinomioVariable.opera2(2, 3, 4, 5));
		
		/* 1. A partir de un número entero, calcular:
		    1. La mitad
		    2. La cuarta parte
		    3. La décima parte*/
		
		EntraIntSaleInt mitad = a -> a/2;
		System.out.println(mitad.opera(4));
		
		EntraIntSaleInt cuartaParte = a -> a/4;
		System.out.println(cuartaParte.opera(4));
		
		EntraIntSaleInt decimaParte = a -> a/10;
		System.out.println(decimaParte.opera(10));
		
		
		/*2. A partir de un Array de enteros primitivos, calcular
    1. La suma
    2. La suma de los pares
    3. La suma de los impares
    4. La suma de los positivos
    5. La suma de los negativos
    6. La suma de los mayores de 100
    7. La suma de los mayores de un número determinado*/
		
		int array[] = {1,2,3,4,5};
		EntraIntSaleInt lambda = a -> a;
		int resultado = 0;
		
		for (int numero : array) {
			resultado += lambda.opera(numero);
		}
		System.out.println(resultado);

		resultado = 0;
		
		for (int i : array) {
			if (i%2 != 0) {
				resultado += lambda.opera(i);
			}
		}
		System.out.println(resultado);
		resultado = 0;
		
		
		
	}
	
	

}

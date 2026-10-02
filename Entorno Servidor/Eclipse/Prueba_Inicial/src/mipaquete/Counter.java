package mipaquete;

public class Counter {

	//Atributos:
	private int value = 0;
	private int maxValue = 100_000;
	private String model = "N-COUNTER";
	
	//Constructores:

	// a. Sin parámetros (No hace falta escribir nada dentro, ya toma los valores de arriba)
	public Counter() {
	}

	// b. Dado maxValue (Modifica solo el maxValue, los demás se quedan con los de arriba)
	public Counter(int maxValue) {
	    this.maxValue = maxValue;
	}

	// c. Datos maxValue y model
	public Counter(int maxValue, String model) {
	    this.maxValue = maxValue;
	    this.model = model;
	}

	// d. Constructor copia (Recibe otro objeto Counter y copia sus valores)
	public Counter(Counter contador) {
	    this.value = contador.value;
	    this.maxValue = contador.maxValue;
	    this.model = contador.model;
	}

	//METODOS
	public boolean increment() {
		if (this.value + 1 > maxValue) {
			return false;
		}else {
			this.value += 1;
			return true;
		}
	}

	public boolean increment(int numero) {
		if (this.value + numero > maxValue) {
			this.value = this.maxValue;
			return false;
		}else {
			this.value += numero;
			return true;
		}
	}
	
	public boolean reset() {
		if (this.value == this.maxValue) {
			this.value = 0;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Contador: modelo " + this.model + " y valor " + this.value + " de " + this.maxValue;
	}

	public static void main(String[] args) {

		Counter contador = new Counter();
		
		contador.increment();
		
		System.out.println(contador);
		
		System.out.println(contador.increment(990));
		System.out.println(contador);
	}


	
}

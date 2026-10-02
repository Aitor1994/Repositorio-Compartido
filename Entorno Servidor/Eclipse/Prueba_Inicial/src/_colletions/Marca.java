package _colletions;

public enum Marca {
	
	//Literal y su Valor
	WK ("WOLKFGVAGEN"),
	CI ("Citroen"),
	TO("TOYOTA"),
	JA("JAGUAR");
	
	//Atributo
	private String marca;
	
	//Constructor
	private Marca(String string) {
		this.marca = string;
	}

	//Get 
	public String getMarca() {
		return marca;
	}
			
	
}

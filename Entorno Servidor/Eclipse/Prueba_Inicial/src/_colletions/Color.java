package _colletions;

public enum Color {

	//Literal y su Valor
	RO("Rojo"),
	NA("Naranja"),
	AM("Amarillo"),
	VE("Verde"),
	AZ("Azul"),
	IN("Indigo"),
	VI("Violeta");

	private String color;

	//Constructor
	private Color(String string) {
		this.color = string;
	}

	//Get
	public String getColor() {
		return color;
	}
	
	
}

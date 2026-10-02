package _colletions;

public class Coche {

	//Atributos: Son de tipo enum , se han de llamar igual que llamamos a la Clase ENUM.
		private Marca marca;
		private Color color;
		
		//Constructores:
		public Coche(Marca marca, Color color) {
			this.marca = marca;
			this.color = color;
		}

		public Coche() {
			super();
		}

		public Color getColor() {
			return color;
		}

		public Marca getMarca() {
			return marca;
		}

		
		//To String
		@Override
		public String toString() {
			return marca + " " + color ;
		}
		
		
		
		
	

}

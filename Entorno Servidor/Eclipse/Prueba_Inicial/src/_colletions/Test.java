package _colletions;

public class Test {

	public static void main(String[] args) {

		    System.out.println("======= INICIANDO PRUEBAS DEL PARKING =======");

		    // 1. Instanciamos el parking tal y como define tu constructor
		    Parking parking = new Parking("Estacionamiento Central", 5);

		    // 2. Creamos instancias de coches usando tus Enums
		    Coche coche1 = new Coche(Marca.WK, Color.RO);
		    Coche coche2 = new Coche(Marca.TO, Color.VE);
		    Coche coche3 = new Coche(Marca.JA, Color.RO);

		    // 3. Probar método entrarCoche(Coche c)
		    System.out.println("\n--> Probando entrarCoche:");
		    System.out.println("¿Entra coche 1? -> " + parking.entrarCoche(coche1));
		    System.out.println("¿Entra coche 2? -> " + parking.entrarCoche(coche2));
		    System.out.println("¿Entra coche 3? -> " + parking.entrarCoche(coche3));

		    parking.reportSetCoches();
		    
		    // 4. Probar listados y reportes por pantalla
		    System.out.println("\n--> Mostrando listado de coches actuales:");
		    parking.mostrarListadoCoches();

		    System.out.println("\n--> Mostrando reporte de colores:");
		    parking.reportColores();

		    // 5. Probar método salirCoche(Coche c)
		    System.out.println("\n--> Probando salirCoche (coche 1):");
		    System.out.println("¿Sale coche 1? -> " + parking.salirCoche(coche1));

		    System.out.println("\n--> Estado tras la salida:");
		    parking.mostrarListadoCoches();

		    // 6. Probar método saleCocheAleatorio()
		    System.out.println("\n--> Probando saleCocheAleatorio:");
		    System.out.println("¿Salió coche aleatorio? -> " + parking.saleCocheAleatorio());
		    parking.mostrarListadoCoches();

		    // 7. Probar método vaciarParking()
		    System.out.println("\n--> Probando vaciarParking:");
		    System.out.println("¿Se vació el parking? -> " + parking.vaciarParking());
		    parking.mostrarListadoCoches();

		    System.out.println("\n======= FIN DE LAS PRUEBAS =======");
		

	}

}

package _colletions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

		//Atributos 
		private String nombre;
		private int totalPlazas;
		private List<Coche> listaDeCoches = new ArrayList<Coche>();
		// Para los mapas es igual, usando HashMap en el lado derecho:
		private Map<Color, Integer> mapaCoches = new HashMap<Color, Integer>();
		private Map<Marca, Integer> mapaMarcas = new HashMap<Marca, Integer>();
		private Map<String, Integer> mapaCochesPorTipo = new HashMap<String, Integer>();
		private Set<String> setTipo = new HashSet<String>();
		
		//Constructor
		public Parking(String nombre, int totalPlazas) {
			super();
			this.nombre = nombre;
			this.totalPlazas = totalPlazas;
		}
		
		//Metodos
		public boolean entrarCoche(Coche c) {
			if (!listaDeCoches.contains(c) && listaDeCoches.size() < totalPlazas) {
				listaDeCoches.add(c);
				Color colorCoche = c.getColor();
				
				int cantidadActual = mapaCoches.getOrDefault(colorCoche, 0);
				mapaCoches.put(colorCoche, cantidadActual+1);
				//Lo mismo para marcas
				Marca marcaCoche = c.getMarca();
				
				int cantidadActual2 = mapaMarcas.getOrDefault(marcaCoche, 0);
				mapaMarcas.put(marcaCoche, cantidadActual2+1);
				
				 // 2. Extraemos las siglas de la marca y del color (ej: "VO" y "VE") y las unimos
			    String tipoCoche = c.getMarca().name() + " " + c.getColor().name();
			    
			    // 3. Buscamos cuántos había de este tipo exacto (si no había, empieza en 0) y le sumamos 1
			    int cantidadActualTipo = mapaCochesPorTipo.getOrDefault(tipoCoche, 0);
			    mapaCochesPorTipo.put(tipoCoche, cantidadActualTipo + 1);
			    
			    // Set Tipos
			    setTipo.add(tipoCoche);
			    
				return true;
			}else {
				return false;
			}
		}
		
		public boolean salirCoche(Coche c) {
			if (listaDeCoches.contains(c) && !listaDeCoches.isEmpty()) {
				listaDeCoches.remove(c);
				Color colorCoche = c.getColor();
				int cantidadActual = mapaCoches.getOrDefault(colorCoche, 0);
				
				if (cantidadActual > 1) {
			        mapaCoches.put(colorCoche, cantidadActual - 1); // Restamos 1
			    } else {
			        mapaCoches.remove(colorCoche); // Si era el último (1), lo borramos del mapa
			    }
				
				//Lo mismo para marcas:
				Marca marcaCoche = c.getMarca();
				int cantidadActual2 = mapaMarcas.getOrDefault(marcaCoche, 0);
				
				// 2. Si hay coches de esa marca (es decir, el contador es mayor que 0)
				if (cantidadActual2 > 1) {
				    // Restamos uno y actualizamos el mapa
				    mapaMarcas.put(marcaCoche, cantidadActual2 - 1);
				} else if (cantidadActual2 == 1) {
				    // Si solo quedaba 1 coche, al quitarlo queda en 0, así que borramos la marca del mapa
				    mapaMarcas.remove(marcaCoche);
				}
				
				//Para TIPOS 
				// 3. Generamos la misma clave con sus siglas (ej: "VO VE")
			    String tipoCoche = c.getMarca().name() + " " + c.getColor().name();
			    
			    // 4. Buscamos cuántos coches de este tipo exacto había en el mapa
			    int cantidadActualTipo = mapaCochesPorTipo.getOrDefault(tipoCoche, 0);
			    
			    // 5. Restamos la unidad correspondiente
			    if (cantidadActualTipo > 1) {
			        // Si había más de uno, simplemente restamos 1
			        mapaCochesPorTipo.put(tipoCoche, cantidadActualTipo - 1);
			    } else {
			        // Si solo quedaba 1, al quitarlo se queda a 0, así que lo borramos del mapa
			        mapaCochesPorTipo.remove(tipoCoche);
			    }
			    
			    //set Tipos
			    setTipo.remove(tipoCoche);
			    
				return true;
			}else {
				return false;
			}
		}
		
		public boolean saleCocheAleatorio() {
			Random random = new Random();
			
			if (!listaDeCoches.isEmpty()) {
				int numeroAleatorio = random.nextInt(listaDeCoches.size()); 
				listaDeCoches.remove(numeroAleatorio);
				return true;
			}else {
				return false;
			}
		}
		
		public boolean vaciarParking() {
			if (!listaDeCoches.isEmpty()) {
		        // Sacamos los coches uno a uno borrando siempre el primero
		        while (!listaDeCoches.isEmpty()) {
		            listaDeCoches.remove(0); 
		        }
		        return true;
		    } else {
		        return false;
		    }
		}


		public void reportColores() {
			String resultado2 = "REPORT DE COLORES\n------------\n";
			resultado2 += "Parking " + nombre +"\n";
			for (Map.Entry<Color, Integer> entry : mapaCoches.entrySet()) {
				Color key = entry.getKey();
				Integer val = entry.getValue();
				resultado2 += "El coche de color " + key + " se repite " + val +" veces. \n";
			}
			resultado2 += "Total de coches: " + listaDeCoches.size();
			
			System.out.println(resultado2);
		}
		
		//to string 
		@Override
		public String toString() {
		    // 1. Empezamos con la cabecera del parking
		    String resultado = "LISTADO COCHES\n--------------\n";
		    resultado += "Parking: " + nombre + "\n";
		    
		    // 2. Recorremos la lista para pintar cada coche uno debajo del otro con sangría
		    for (Coche coche : listaDeCoches) {
		        resultado += "  Coche: " + coche + "\n"; 
		        // Nota: 'coche' llamará automáticamente al toString() de la clase Coche
		    }
		    
		    // 3. Añadimos el resumen final con los cálculos que ya tenías bien pensados
		    resultado += "Total coches: " + listaDeCoches.size() + 
		                 ", plazas libres: " + (totalPlazas - listaDeCoches.size());
		                 
		    return resultado;
		}
		
		/*Crea los métodos que necesites para generar los reports que se indican a continuación:
		- Listado de coches del parking.
		ES BASICAMENTE LALMAR AL TO STRING CUANDO USEMOS EL METODO CON ESE NOMBRE. */
		
		public void mostrarListadoCoches() {
		    System.out.println(this.toString()); // Aprovecha el toString() que ya curraste
		}

		
		//El tostring del set
		public void reportSetCoches() {
			String reportset = "REPORT SET DE COCHES \n"
					+ "------------------------------ \n"
					+ "Parking: " + nombre + "\n";
			
			for (Coche coche : listaDeCoches) {
				reportset += "Coche: " + coche +"\n";
			}
			
			reportset += "Total items: " + listaDeCoches.size();
			
			System.out.println(reportset);
		}
}

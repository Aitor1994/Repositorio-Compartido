package com.jordi.primer_proyecto.model;

public class Taller {

	//Atributos
	private int id;
	private String nombre;
	private int plazas;
	//Es un atributo que usamos para ir dandole valor al ID automaticamente al crear un nuevo taller 1, 2, 3, 4....
	//IMPORTANTE: El atributo debe ser static para que sea compartido por todas las instacias sino siempre seria 1
	private static int nextId = 1;
	
	//Constructor
	public Taller(String nombre, int plazas) {
		this.id = nextId;
		nextId++;
		this.nombre = nombre;
		this.plazas = plazas;
	}

	//Get y Set
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPlazas() {
		return plazas;
	}

	//To string
	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + ", plazas=" + plazas + "]";
	}
	

}

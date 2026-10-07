package com.jordi.proyecto_taller.models;


public class Taller {
	
	//Atributos
	private int id;
	private String nombre;
	private int plazas;
	
	//Constructor
	public Taller(int id, String nombre, int plazas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.plazas = plazas;
	}

	
	//GET Y SET
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPlazas() {
		return plazas;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Taller [id=" + id + ", nombre=" + nombre + ", plazas=" + plazas + "]";
	}
	

}

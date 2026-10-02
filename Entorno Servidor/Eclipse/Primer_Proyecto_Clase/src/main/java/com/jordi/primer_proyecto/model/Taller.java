package com.jordi.primer_proyecto.model;

import java.util.ArrayList;
import java.util.List;

public class Taller {

	//LAS CLASES SE CREAN DENTRO DE UN NUEVO PAQUETE DENTRO DEL PAQUETE BASE, AQUI IRAN LAS CLASES:
	private int id;
	private String nombre;
	private int plazas;
	private static int nextId = 1;
	//cONSTRUCTOR
	public Taller(String nombre, int plazas) {
		id = nextId;
		nextId ++;
		this.nombre = nombre;
		this.plazas = plazas;
	}	
	
	//get y set
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getPlazas() {
		return plazas;
	}

	//to string
	@Override
	public String toString() {
		return "Taller [id=" + id + ", nombre=" + nombre + ", plazas=" + plazas + "]";
	}

	
	
}

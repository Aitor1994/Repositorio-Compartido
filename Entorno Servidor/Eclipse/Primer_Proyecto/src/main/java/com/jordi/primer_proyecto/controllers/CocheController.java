package com.jordi.primer_proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

class Coche{
	private String marca;
	private String modelo;
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	
}


@Controller
public class CocheController {

	@GetMapping("/Coche")
	public String mostrarCoche(Model model) {
		model.addAttribute("Coche", new Coche("Seat","600"));
		return "coche/Coche";
	}
}

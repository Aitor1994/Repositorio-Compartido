package com.jordi.guiaspringboot.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

//Se le pone la Anotacion @Controller para que srpingBoot sepa que contiene los controlodores, sino lo ignoraria.
@Controller
public class Controladores {

//Con @ModelAttribute creamos una "Caja" que enviamos desde JAVA a nuestro HTML que contenga el nombre de la etiqueta de la CAJA (name)
	//Con el return devolvemos lo que queramos que sustituya donde esa la Etiqueta.
	@ModelAttribute(name = "titulo")
	public String model(){
		return "PESTAÑA";
	}
	
	@ModelAttribute(name = "mensaje")
	public String mensaje() {
		return "Enviamos este mensaje con model desde JAVA al HTML";
	}
	
	@ModelAttribute(name = "fecha")
	public LocalDate fechaActual() {
		return LocalDate.now();
	}
	
//GetMapping es el que recoge la IRL , es lo que tendras que poner en la barra de busqueda para que retorne el HTML del return
	//El return devuelve un String que es el nombre del archivo HTML que mostrara:
	@GetMapping({"/Pagina-principal"})
	public String paginaPrincipal() {
		return "Principal";
	}
	
	@GetMapping({"/oferta"})
	public String paginaOferta(Model mochila) {
		// Dato 1: El descuento (Texto)
		mochila.addAttribute("descuento", "¡Hoy tienes un 50% de descuento!");
		// Dato 2: Una fecha de caducidad para la oferta (Usando LocalDate)
		// Cambiamos la etiqueta a "caducidad" para que el HTML sepa diferenciarlo del descuento
		mochila.addAttribute("caducidad", LocalDate.now().plusDays(7)); // ¡La oferta dura 7 días!
		
		return "Oferta";
	}


	

}

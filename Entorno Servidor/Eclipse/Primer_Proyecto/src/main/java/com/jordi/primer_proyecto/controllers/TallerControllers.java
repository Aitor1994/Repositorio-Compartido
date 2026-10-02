package com.jordi.primer_proyecto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordi.primer_proyecto.model.Taller;

@RequestMapping("/taller")
@Controller
public class TallerControllers {

	//Creamos un atributo lista de talleres
	List<Taller> listaTalleres = añadirTalleres();
	
	private List<Taller> añadirTalleres(){
		List<Taller> listaTalleres = new ArrayList<>();
		listaTalleres.add(new Taller("Toyota", 1));
		listaTalleres.add(new Taller("Seat", 2));
		listaTalleres.add(new Taller("Jaguar", 3));
		listaTalleres.add(new Taller("BMW", 4));
		listaTalleres.add(new Taller("Tesla", 5));

		return listaTalleres;
	}
	
	private Taller buscarTaller(int id) {
		Taller taller = null;
		for (Taller t : listaTalleres) {
			if (t.getId() == id) {
				taller = t;
			}
		}
		return taller;
	}
	
	//AQUI CREAMOS Y ALOS HANDLER QUE HARAN CONEXION CON EL HTML
	
	//Para coger el id y poder usar el metodo de buscar el taller.
	/*Usamos el metodo de arriba que devuelve un taller para mandarlo por aqui al HTML (vamos viendo como jugar con los metodos 
	 * entre si), al no poder crear un taller aqui lo traemos con buscarTaller(). */
	@GetMapping("/{id}")
	public String enviarTaller(Model model, @PathVariable int id) {
		model.addAttribute("taller", buscarTaller(id));
		return "html/taller";
	}
	
	//Ahora vamos a enviar la lista comlpleta en vez de 1 en 1.
	@GetMapping("/lista-taller")
	public String enviarLista(Model model) {
		model.addAttribute("talleres", listaTalleres);
		return "html/lista-talleres";
	}
	
	
}

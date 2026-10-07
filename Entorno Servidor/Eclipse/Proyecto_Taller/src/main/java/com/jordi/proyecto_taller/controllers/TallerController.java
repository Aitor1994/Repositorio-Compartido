package com.jordi.proyecto_taller.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordi.proyecto_taller.models.Taller;

@RequestMapping("taller")
@Controller
public class TallerController {
	//Las clases CONTROLLER tambien pueden tener atributos:
	private List<Taller> listaTalleres = rellenarListaTaller();
	//Este metodo es solo para rellenar la lista de talleres.
	public List<Taller> rellenarListaTaller(){
		listaTalleres = new ArrayList<Taller>();
		
		listaTalleres.add(new Taller(1, "BMW", 100));
		listaTalleres.add(new Taller(2, "Toyota", 150));
		listaTalleres.add(new Taller(3, "Audi", 200));
		listaTalleres.add(new Taller(4, "Renault", 300));
		listaTalleres.add(new Taller(5, "Jaguar", 400));
		
		return listaTalleres;
	}
	
	//Como necesitamos un metodo que devuelva un taller concreto segun un dato lo creamos aparte.
	public Taller devolverTaller(int id) {
		Taller taller = null;
		for (Taller t : listaTalleres) {
			if (t.getId() == id) {
				taller = t;
			}
		}
		return taller;
	}
	
	//Creamos la principal que tendra links a las otras URL
	@GetMapping("/principal")
	public String paginaPrincipal() {
		return "html/index.html";
	}
	
	//Con GetMapping nombramos la URL donde se mostrara el HTML que devuelve el Return:
	//Con @PathVariable cogeremos el dato introducido en la URL  y lo usaremos en nuestra función.
	@GetMapping("/{id}")
	public String mostrarTaller(Model model, @PathVariable int id) {
		model.addAttribute("titulo", "TALLER");
		if (devolverTaller(id) == null) {
			return "html/not-found";
		}
		model.addAttribute("etiqueta", devolverTaller(id));
		return "html/taller";
	}
	
	//Devolvemos toda una Lista con Model para poder recorrerla en el HTML con tymeleaf.
	@GetMapping("/lista")
	public String mostrarLista(Model model) {
		model.addAttribute("lista", listaTalleres);
		model.addAttribute("titulo", "LISTA DE TALLERES");
		return "html/lista-talleres";
	}
}

package com.jordi.primer_proyecto.Controllers;

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
public class TallerController {

	private final List<Taller> listaTalleres = añadirTaller();
	
	private List<Taller> añadirTaller() {
		List<Taller> listaTalleres = new ArrayList<>();
		
		listaTalleres.add(new Taller("Taller 1", 20));
		listaTalleres.add(new Taller("Taller 2", 30));
		listaTalleres.add(new Taller("Taller 3", 40));
		listaTalleres.add(new Taller("Taller 4", 50));
		listaTalleres.add(new Taller("Taller 5", 60));

		return listaTalleres;
	}
	
	private Taller dameIdTaller(int id) {
		Taller taller = null;
		for (Taller t : listaTalleres) {
			if (t.getId() == id) {
				taller = t;
				return t;
			}
		}
		return null;
	}
	
	//Estos metodos se llaman handler
	@GetMapping("/uno/{id}")
	public String traerId(Model model, @PathVariable int id) {
		model.addAttribute("taller", dameIdTaller(id));
		return "html/taller";
	}
	
	//NOS TRAEMOS TODA LA LISTA DEL TIRON
	@GetMapping("/todos")
	public String traerTodos(Model model) {
		model.addAttribute("talleres",listaTalleres);
		return "html/lista";
	}
}

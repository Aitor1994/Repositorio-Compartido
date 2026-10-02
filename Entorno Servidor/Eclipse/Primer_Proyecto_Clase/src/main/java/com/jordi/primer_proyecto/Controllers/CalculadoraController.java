package com.jordi.primer_proyecto.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

//REQUESTMAPPING Obliga a que todas las URL empiecen por /ejercicio/...
@Controller
//@RequestMapping("/ejercicio")
public class CalculadoraController {

	@ModelAttribute(name = "etiqueta")
	public String setEtiqueta() {
		return "ATRIBUTO";
	}
	
	//Aqui usamos @PathVariable para pasar las variables directamente a la vista(HTML) y alli las usamos:
	@GetMapping("/Calculadora/sumar/{numero1}/{numero2}")
	public String sumar(@PathVariable Integer numero1, @PathVariable Integer numero2) {
		return "html/Calculadora";
	}
	
	//Pero podemos usar Model para realizar las operaciones aqui y pasarle con model el resultado:
	@GetMapping("/Calculadora/multiplicar/{numero1}/{numero2}")
	public String multiplicar(@PathVariable Integer numero1, @PathVariable Integer numero2, Model model) {
		int resultado = numero1 * numero2;
		model.addAttribute("resultado", resultado);
		return "html/Calculadora";
	}

	
}

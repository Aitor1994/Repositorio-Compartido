package com.jordi.primer_proyecto.Controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

//Usamos el @Controller para decirle a SpringBoot que esto es una CLASE CONTROLLER:
@Controller
public class Controladores {

//Otra anotacion es @ModelAtributte, la usamos para hacer lo mismo que con Model pero podra usar el dato pasado 
//todos los HTML que se devuelvan dentro de esta clase (los que devuelva el return)
	//Registra el nombre de la variable que luego vas a escribir en tu HTML usando Thymeleaf como ${curso}.
	@ModelAttribute(name = "curso")
	public String setCurso() {
		return "2º DAW";
	}
	
//Usamos @GetMapping para indicarle la URL que tendremos que usar en el navegador y poder usar los metodos
//que devolveran un String con el nombre exacto del HTML a mostrar:
	@GetMapping({"/Pagina-principal"})
	public String MostrarPaginaPrincipal() {
		return "html/Principal";
	}
	
//Usamos la CLASE Model de java para poder introducir a mano con un metodo que tiene definido indicandole
	//"Etiqueta, "lo que queramos sustiuir en el HTML por la etiqueta";
	@GetMapping({"/Lanzar-dado"})
	public String MostrarPaginaDado(Model model) {
		Random random = new Random();
		model.addAttribute("dado", random.nextInt(1,7));
		model.addAttribute("dado2", random.nextInt(7,15));
		return "html/Lanzar-dado";
	}
	
//Usamos @PathVariable para recoger DATOS de la URL y meterlos en las variables del mismo nombre en el HTML que hagamos return;
	//Registra el nombre de las variables del URL y los introduce en la variable del HTML con el mismo nombre.
	//Los atributos que recogemos se los pasamos al metodo como Atributos.
	//En la "Pagina-Principal" que ya teniamos cosas estamos añadiendole mas atributos por URL con @PathVariable
	@GetMapping({"/Pagina-principal/{nombre}/{apellido}/{edad}"})
	public String pathVar(@PathVariable String nombre,@PathVariable String apellido,@PathVariable Integer edad) {
		return "html/Principal";
	}

}

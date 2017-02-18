package my.project.mywebapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.project.mywebapp.data.model.Estudiante;
import my.project.mywebapp.lao.EstudianteLao;

@Controller
public class EstudianteController {
	
	@Autowired
	private EstudianteLao estudianteLao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		return "redirect:login";
	}
	
	@RequestMapping(value ="estudiantes",method = RequestMethod.GET)
	public String vistaEstudiante(Model model) throws IOException{
		populateData(model);
		model.addAttribute("estudianteForm", estudianteLao.getEstudiante());
		return "crearEstudiante"; 
	
	}
	
	@RequestMapping(value="estudiantes/add",method = RequestMethod.POST)
	public String addEstudiante(@ModelAttribute ("estudianteForm")Estudiante estu,Model model) throws IOException{
	 this.estudianteLao.storeEstudiante(estu);
	 this.populateData(model);
	 return "crearEstudiante";
	}
	
	private void populateData(Model model){
		
		List<String> nivelEstudios = new ArrayList<String>();
		nivelEstudios.add("Primaria");
		nivelEstudios.add("Secundaria");
		nivelEstudios.add("Bachillerato");
		model.addAttribute("nivelEstudios", nivelEstudios);
		
	}
}

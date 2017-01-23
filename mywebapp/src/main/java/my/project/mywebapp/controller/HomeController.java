package my.project.mywebapp.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) throws IOException{
		//return new ModelAndView("home");
		model.addAttribute("mensaje","Hola que tal");
		return "home";
	}
}

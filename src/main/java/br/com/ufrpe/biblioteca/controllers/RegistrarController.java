package br.com.ufrpe.biblioteca.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrarController {
	
	@RequestMapping("/registrar")
	public String form() {
		return "evento/registrar";
	}

}

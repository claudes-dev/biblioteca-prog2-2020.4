package br.com.ufrpe.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "Evento/formEvento";
	}

}

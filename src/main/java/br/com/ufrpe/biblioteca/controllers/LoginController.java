package br.com.ufrpe.biblioteca.controllers;

import br.com.ufrpe.biblioteca.domain.dto.UserLoginRequestDTO;
import br.com.ufrpe.biblioteca.domain.model.Usuario;
import br.com.ufrpe.biblioteca.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class LoginController {

	@Autowired
	private IUsuarioService usuarioService;

	@RequestMapping("/login")
	public String form() {
		return "evento/login";
	}

	@PostMapping("/login/entrar")
	public ModelAndView entrar(@Validated UserLoginRequestDTO userLoginRequestDTO, BindingResult result){

		Usuario usuario = usuarioService.findByEmailAndSenha(userLoginRequestDTO);

		ModelAndView modelAndView = new ModelAndView("evento/index");

		return modelAndView;
	}

}

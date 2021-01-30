package br.com.ufrpe.biblioteca.controllers;

import br.com.ufrpe.biblioteca.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

}

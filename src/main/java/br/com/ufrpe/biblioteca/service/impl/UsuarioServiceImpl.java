package br.com.ufrpe.biblioteca.service.impl;

import br.com.ufrpe.biblioteca.dao.UsuarioRepository;
import br.com.ufrpe.biblioteca.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

}

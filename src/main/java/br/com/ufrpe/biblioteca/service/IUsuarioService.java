package br.com.ufrpe.biblioteca.service;

import br.com.ufrpe.biblioteca.domain.dto.UserLoginRequestDTO;
import br.com.ufrpe.biblioteca.domain.model.Usuario;

public interface IUsuarioService {

    Usuario findByEmailAndSenha(UserLoginRequestDTO userLoginRequestDTO);
}

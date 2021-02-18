package br.com.ufrpe.biblioteca.service.impl;

import br.com.ufrpe.biblioteca.dao.UsuarioRepository;
import br.com.ufrpe.biblioteca.domain.dto.UserLoginRequestDTO;
import br.com.ufrpe.biblioteca.domain.model.Usuario;
import br.com.ufrpe.biblioteca.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findByEmailAndSenha(UserLoginRequestDTO userLoginRequestDTO){

        Usuario usuario = usuarioRepository.findByEmail(userLoginRequestDTO.getEmail());

        if(usuario.getSenha().equals(userLoginRequestDTO.getSenha())){
            return usuario;
        }else{
            return null;
        }

    }


}

package br.com.ufrpe.biblioteca.dao;

import br.com.ufrpe.biblioteca.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Usuario findByEmail(String email);

    String findBySenha(String senha);

}

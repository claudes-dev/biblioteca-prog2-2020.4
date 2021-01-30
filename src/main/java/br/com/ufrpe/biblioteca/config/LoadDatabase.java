package br.com.ufrpe.biblioteca.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ufrpe.biblioteca.dao.UsuarioRepository;
import br.com.ufrpe.biblioteca.domain.model.Usuario;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class LoadDatabase {
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	public CommandLineRunner initDatabase(UsuarioRepository repository) {

		Date dataNascimento = new Date("07/02/1999");
		return args -> {
			log.info("Preloading " + repository.save(new Usuario("Claudes", "claudesferreira99@gmail.com", dataNascimento,"aluno","12312312312","123")));
		};	
	}

}

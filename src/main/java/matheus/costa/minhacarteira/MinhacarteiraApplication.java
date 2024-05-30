package matheus.costa.minhacarteira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import matheus.costa.minhacarteira.model.Usuario;

@SpringBootApplication
public class MinhacarteiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhacarteiraApplication.class, args);

		Usuario usuario = new Usuario();
		usuario.setNome("matheus");
	}

}

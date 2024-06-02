package matheus.costa.minhacarteira.service;

import matheus.costa.minhacarteira.model.Usuario;

public interface UsuarioService {

	
	//TDD
	
	Usuario autenticar(String email, String senha);
	
	Usuario cadastrarUsuario(Usuario usuario);
	
	void validarEmail(String email);



}

package matheus.costa.minhacarteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import matheus.costa.minhacarteira.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}

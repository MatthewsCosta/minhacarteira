package matheus.costa.minhacarteira.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario", schema = "carteira")
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class Usuario {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "senha")
	private String senha;

}

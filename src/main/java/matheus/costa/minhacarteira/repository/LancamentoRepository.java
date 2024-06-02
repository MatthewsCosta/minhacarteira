package matheus.costa.minhacarteira.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import matheus.costa.minhacarteira.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}

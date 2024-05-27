package matheus.costa.minhacarteira.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lancamentos", schema = "carteira")
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "mes")
	private Integer mes;
	
	@Column(name = "ano")
	private Integer ano;
	
	@Column(name = "valor")
	private BigDecimal valor;

	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private TipoStatus status;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name ="data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate datacadastro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoLancamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}

	public TipoStatus getStatus() {
		return status;
	}

	public void setStatus(TipoStatus status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(LocalDate datacadastro) {
		this.datacadastro = datacadastro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, datacadastro, descricao, id, mes, status, tipo, usuario, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(datacadastro, other.datacadastro)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(mes, other.mes) && status == other.status && tipo == other.tipo
				&& Objects.equals(usuario, other.usuario) && Objects.equals(valor, other.valor);
	}

	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", mes=" + mes + ", ano=" + ano + ", valor="
				+ valor + ", tipo=" + tipo + ", status=" + status + ", usuario=" + usuario + ", datacadastro="
				+ datacadastro + "]";
	}
	

	
}

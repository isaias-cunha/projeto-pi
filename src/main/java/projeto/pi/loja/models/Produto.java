package projeto.pi.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome, marca, preco, qtd;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPreco() {
		return preco;
	}


	public void setPreco(String preco) {
		this.preco = preco;
	}


	public String getQtd() {
		return qtd;
	}


	public void setQtd(String qtd) {
		this.qtd = qtd;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", qtd=" + qtd + "]";
	}
	
	
}

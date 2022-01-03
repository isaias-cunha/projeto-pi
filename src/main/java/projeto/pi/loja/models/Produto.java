package projeto.pi.loja.models;

<<<<<<< Updated upstream
import java.util.Date;

=======
>>>>>>> Stashed changes
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
<<<<<<< Updated upstream

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String nome, marca;
	private Date validade; 
	private int qtd;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
=======
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String marca;
	private Double preco;
	private int qdt;
	
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
}
	
	
	
=======
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQdt() {
		return qdt;
	}
	public void setQdt(int qdt) {
		this.qdt = qdt;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", qdt=" + qdt + "]";
	}
	
	
	
}
>>>>>>> Stashed changes

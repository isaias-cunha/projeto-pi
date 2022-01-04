package projeto.pi.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "papel")
public class Papel implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Papel() {
		
	}

	public Papel(String papel) {
		this.nome = papel;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return nome;
	}

	public void setRole(String papel) {
		this.nome = papel;
	}

	@Override
	public String getAuthority() {
		return this.nome;
	}

}

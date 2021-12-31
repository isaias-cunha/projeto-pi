package projeto.pi.loja.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Papel implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String papel;

	public Papel(String papel) {
		this.papel = papel;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return papel;
	}

	public void setRole(String papel) {
		this.papel = papel;
	}

	@Override
	public String getAuthority() {
		return this.papel;
	}

}

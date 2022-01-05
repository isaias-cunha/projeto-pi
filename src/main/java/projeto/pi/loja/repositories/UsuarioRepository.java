package projeto.pi.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.pi.loja.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);
	
}

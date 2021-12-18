package projeto.pi.loja.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.pi.loja.models.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}

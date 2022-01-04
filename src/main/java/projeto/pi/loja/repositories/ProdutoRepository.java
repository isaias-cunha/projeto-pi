package projeto.pi.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.pi.loja.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}

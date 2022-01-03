package projeto.pi.loja.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import projeto.pi.loja.models.Produto;
import projeto.pi.loja.models.Usuario;
import projeto.pi.loja.repositories.ProdutoRepository;
import projeto.pi.loja.repositories.UsuarioRepository;

@Controller
public class ExemploController {
	
	@Autowired
	private UsuarioRepository ur;
	@Autowired
	private ProdutoRepository pr;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/funcionario")
	public String estoque() {
		return "p-funcionario";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "p-cadastro-cliente";
	}
	@PostMapping("/salvar_cliente")
	public String cadastrar(Usuario user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String password = encoder.encode(user.getSenha());
		user.setSenha(password);
		ur.save(user);
		
		return "redirect:/";
	}
	@PostMapping("/cadastrar_produto")
	public String salvarProduto(Produto produto) {
		System.out.println(produto);
		pr.save(produto);
		
		return "redirect:/gerente";
	}
}
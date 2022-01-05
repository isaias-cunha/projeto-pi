package projeto.pi.loja.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projeto.pi.loja.models.Papel;
import projeto.pi.loja.models.Produto;
import projeto.pi.loja.models.Usuario;
import projeto.pi.loja.repositories.ProdutoRepository;
import projeto.pi.loja.repositories.UsuarioRepository;
import projeto.pi.loja.service.CustomDetailsService;
@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private ProdutoRepository pr;
	private CustomDetailsService sv;
	
	@GetMapping("/inicio")
	public String index() {
		return "redirect:/";
	}
	
	@GetMapping
	public ModelAndView listar() {
	List<Produto> produtos = pr.findAll();
	ModelAndView mv = new ModelAndView("index");
	mv.addObject("produtos", produtos);
	return mv;
	}
	
}
package projeto.pi.loja.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import projeto.pi.loja.models.Produto;
import projeto.pi.loja.repositories.ProdutoRepository;

@Controller
@RequestMapping("/gerente")
public class GerenteController {
	@Autowired
	private ProdutoRepository pr;
	
	@GetMapping("/adm")
	public String gerente() {
		return "redirect:/gerente";
	}
	
	@GetMapping
	public ModelAndView listar() {
	List<Produto> produtos = pr.findAll();
	ModelAndView mv = new ModelAndView("p-gerente");
	mv.addObject("produtos", produtos);
	return mv;
	}
	@GetMapping("/{id}/remover")
	public String apagarEvento(@PathVariable Long id, RedirectAttributes attributes) {

		Optional<Produto> opt = pr.findById(id);

		if (!opt.isEmpty()) {
			Produto produto = opt.get();
			pr.delete(produto);
			attributes.addFlashAttribute("mensagem", "Evento removido com sucesso!");
		}
		return "redirect:/gerente";
	}

}

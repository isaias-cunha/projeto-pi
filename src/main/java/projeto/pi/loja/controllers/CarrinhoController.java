package projeto.pi.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarrinhoController {
	
	@GetMapping("/carrinho")
	public ModelAndView chamarCarrinho() {
		ModelAndView mv = new ModelAndView("carrinho");
		return mv;
		
	}

	@GetMapping("/adicionarCarrinho/{id}")
	public ModelAndView adicionarCarrinho(@PathVariable Long id) {
		System.out.println();
		ModelAndView mv = new ModelAndView("carrinho");
		return mv;
		
	}
}

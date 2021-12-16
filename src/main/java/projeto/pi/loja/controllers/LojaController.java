package projeto.pi.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojaController {

	@RequestMapping("/loja/cliente")
	public String login() {
		return "p-cadastro-cliente";
	}
}

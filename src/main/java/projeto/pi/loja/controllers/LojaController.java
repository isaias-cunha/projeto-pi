package projeto.pi.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projeto.pi.loja.models.Cliente;
import projeto.pi.loja.repositorios.ClienteRepositorio;

@Controller
public class LojaController {
	@Autowired
	private ClienteRepositorio cr;

	@RequestMapping("/cadastro")
	public String login() {
		return "p-cadastro-cliente";
	}
	@PostMapping("/loja")
	public String cadastrar(Cliente cliente) {
		System.out.println(cliente);
		cr.save(cliente);
		return "cliente-cadastrado";
	}
}

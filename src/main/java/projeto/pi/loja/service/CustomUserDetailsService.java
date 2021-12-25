package projeto.pi.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import projeto.pi.loja.models.Cliente;
import projeto.pi.loja.repositorios.ClienteRepositorio;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Cliente cliente = clienteRepositorio.findByEmail(username);
		
		if(cliente == null) {
			throw new UsernameNotFoundException("Usuário não encontrado.");
		}
		
		return cliente;
	}

}

package projeto.pi.loja.service;

import java.util.Arrays;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import projeto.pi.loja.models.*;
import projeto.pi.loja.repositories.UsuarioRepository;

@Component
public class CustomDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(username);
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário não encontrado!");
		}
		return usuario;
	}
	@PostConstruct
    private void postConstruct() {
        Usuario gerente = new Usuario();
        gerente.setEmail("gerente@gmail.com");
        if(usuarioRepository.findByEmail(gerente.getEmail()) == null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    		String password = encoder.encode("123456ADM");
            gerente.setSenha(password);
            gerente.setRoles(Arrays.asList(new Papel("ROLE_GERENTE")));
            usuarioRepository.save(gerente);
        }
    }

}

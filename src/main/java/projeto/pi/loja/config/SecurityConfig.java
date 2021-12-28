package projeto.pi.loja.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import projeto.pi.loja.service.CustomDetailsService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private CustomDetailsService customDetailsService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.userDetailsService(customDetailsService)
			.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

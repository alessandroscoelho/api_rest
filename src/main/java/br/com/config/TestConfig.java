package br.com.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.domain.User;
import br.com.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private UserRepository userRepository;
	
	@Bean
	public String startDB() {
		
		User u1 = new User(null, "Alessandro", "alessandro@gmail.com", "123");
		User u2 = new User(null, "Eliete", "eliete@gmail.com", "123");
		
		userRepository.saveAll(List.of(u1, u2));
		
		return "startado";
		
	}
	
}

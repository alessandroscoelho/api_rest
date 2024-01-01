package br.com.services;

import java.util.List;

import br.com.domain.User;
import br.com.domain.dto.UserDTO;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();
	
	User create(UserDTO obj);
	
}


package br.com.services;

import java.util.List;

import br.com.domain.User;

public interface UserService {

	public User findById(Integer id);
	
	public List<User> findAll();
	
}


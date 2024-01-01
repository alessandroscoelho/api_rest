package br.com.services.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.domain.User;
import br.com.domain.dto.UserDTO;
import br.com.repositories.UserRepository;
import br.com.services.UserService;
import br.com.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public User findById(Integer id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Usuario nao encontrado."));
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User create(UserDTO obj) {
		return userRepository.save(mapper.map(obj, User.class));
	}
	
	

}

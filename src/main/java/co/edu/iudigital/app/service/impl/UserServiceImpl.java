package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User login(User user) throws Exception {
		User existsUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if (existsUser == null) {
			throw new Exception("Usuario y/o contraseña invalido");
		}
		return existsUser;

	}

}

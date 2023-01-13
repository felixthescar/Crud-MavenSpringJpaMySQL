package com.bank.bankofrupcy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.bankofrupcy.model.User;
import com.bank.bankofrupcy.repository.UserRepository;

@Component
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public User findById(Long id) {
		return userRepo.findById(id).get();
	}

	public List<User> findAll() {
		return (List<User>) userRepo.findAll();
	}

	public void deleteById(Long id) {
		userRepo.deleteById(id);
	}

	public void save(User user) {
		userRepo.save(user);
	}

	public void update(Long id, String username, String password) {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		userRepo.save(user);
	}

	public User findUserByUsername(String username) {
		List<User> users = (List<User>) userRepo.findAll();
		for (User user : users) {
			if (username.equals(user.getUsername())) {
				return user;
			}
		}
		return null;
	}
}

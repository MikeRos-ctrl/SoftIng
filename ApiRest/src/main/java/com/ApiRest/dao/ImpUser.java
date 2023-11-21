package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.User;
import com.ApiRest.repository.UserRepo;

@Service
public class ImpUser implements IUser {

	@Autowired
	UserRepo repo;

	@Override
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	public User login(String USERNAME, String PWD) {
		Long respuesta = repo.Login(USERNAME, PWD);

		return repo.findById(respuesta).orElse(null);
	}
}
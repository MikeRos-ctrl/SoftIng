package com.ApiRest.dao;

import com.ApiRest.entity.Persona;
import com.ApiRest.entity.User;

public interface IUser {

	public User save(User user);
	
	public User login(String USERNAME, String PWD);
}
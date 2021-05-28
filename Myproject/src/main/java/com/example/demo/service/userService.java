package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.userDao;
import com.example.demo.models.user;

@Service
public class userService {
	
	@Autowired
	private userDao repos;
	
	public user addUser(user usr) {
		return repos.save(usr);
	}

	public Collection<user> getAllUsers(){
		return repos.findAll();
	}
	
	public void deleteUser(user u) {
		repos.delete(u);
	}
	public void saveUser(user u) {
		repos.save(u);
	}
}

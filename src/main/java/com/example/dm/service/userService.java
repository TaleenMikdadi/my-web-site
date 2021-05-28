package com.example.dm.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dm.DAO.userDao;
import com.example.dm.models.user;

@Service
public class userService {
	
	@Autowired
	private userDao repos;
	//add a new user
	public user addUser(user usr) {
		return repos.save(usr);
	}
	//method to return all users
	public Collection<user> getAllUsers(){
		return repos.findAll();
	}
	//method to delete a user
	public void deleteUser(user u) {
		repos.delete(u);
	}
	//method to update a user
		public void updateUser(user u) {
		  repos.save(u);
		}
	//method to save a user's information
	public void saveUser(user u) {
		repos.save(u);
	}
	//method to return all users information
	public Collection<user> getUser(){
		return repos.findAll();
	}
	public user login(String email , String password)
	{
		return repos.login(email, password);
	}
}

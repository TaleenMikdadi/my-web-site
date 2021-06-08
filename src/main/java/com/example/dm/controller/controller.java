package com.example.dm.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dm.models.property;
import com.example.dm.models.user;
import com.example.dm.service.propertyService;
import com.example.dm.service.userService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class controller {
	
	@Autowired
	private userService serv;
	@Autowired
	private propertyService proserv;
	
	@PostMapping(value="user/addPro", consumes ="application/json",produces ="application/json")
	public property addprob(@RequestBody property p)
	{
		return proserv.addProperty(p);
	}
	@DeleteMapping("admin/deleteP/{id}")
	public void removeById(@RequestParam(name="id") int id)
	{
		 proserv.removeP(id);
	}
	
	@GetMapping(value="user/getAllProp")
	public Collection<property> getAll()
	{
		return proserv.getAll();
	}
	
	@PostMapping(value ="admin/userLogin/{email}/{password}")
	public user loginUser(@PathVariable(name="email" )String  email , @PathVariable String password)
	{
		return serv.login(email, password);
	}
	@PostMapping(value="admin/addUser", consumes ="application/json",produces ="application/json")
	public user addUsers(@RequestBody user u) {
		System.out.println(u);
		return serv.addUser(u);
	}
	
	@GetMapping("/admin/getAll")
	public Collection<user> getAllUsers()
	{
		return serv.getAllUsers();
	}
}

package com.example.dm.controller;

import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	@GetMapping(value="user/getAllProp")
	public Collection<property> getAll()
	{
		return proserv.getAll();
	}
	
	@GetMapping("/admin/{email}/{password}")
	public user login(@PathVariable(name="email") String email, @PathVariable String password)
	{
		return serv.login( email, password);
	}
	
	//add user then return good when added
	@PostMapping(value="admin/addUser", consumes ="application/json",produces ="application/json")
	public user addUsers(@RequestBody user u) {
		System.out.println(u);
		return serv.addUser(u);
		//return "good";
	}
	
	@GetMapping("/admin/getAll")
	public Collection<user> getAllUsers()
	{
		return serv.getAllUsers();
	}
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.service.userService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class controller {
	
	@Autowired
	private userService serv;
	
	@PostMapping("admin/addUser")
	public String addUsers(user u) {
		serv.addUser(u);
		return "good";
	}
}

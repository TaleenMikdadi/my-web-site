package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.service.userService;

@RestController
public class admin {
	@Autowired
	userService uDao;
	
	//@RequestMapping(value="/admin/addUser",method = RequestMethod.POST)
	//@PostMapping(path="/admin/addUser",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
	//@RequestMapping(value = "/admin/addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
	  //      produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping(
			  value = "/admin/addUser", consumes = "application/json", produces = "application/json")
	public user  addUser(@RequestBody user usr)
	{
		//ResponseEntity<String>
		user n = new  user();
		System.out.println(usr);
		n.setEmail(usr.getEmail());
		n.setFname(usr.getFname());
		n.setLname(usr.getLname());
		n.setPhone(usr.getPhone());
		n.setPassword(usr.getPassword());
		 uDao.saveUser(n);
		 HttpHeaders httpHeaders = new HttpHeaders();

	    //  return new ResponseEntity<>("{}", httpHeaders, HttpStatus.CREATED);
		 return n;
		
	}
	@GetMapping("/admin/getAll")
	public Collection<user>getAllUsers()
	{
		return uDao.getAllUsers();
	}
	
	@RequestMapping("/admin/testMethods/hi")
	@ResponseBody
	public String printHi()
	{
		return "hi";
	}

}

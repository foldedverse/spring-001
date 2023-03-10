package com.in28mintes.rest.webservice.restfullwebservice.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private  UserDaoService service;
	
	public UserResource (UserDaoService service) {
		this.service = service ;
	}
	
	
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return service.findAll(); 
	}
	
	
	
}

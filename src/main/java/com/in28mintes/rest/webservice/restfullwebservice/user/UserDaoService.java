package com.in28mintes.rest.webservice.restfullwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA Hibernate
	
	// public List<user> findAll()

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam1",LocalDate.now().minusYears(30)));
		users.add(new User(2,"Adam2",LocalDate.now().minusYears(30)));
		users.add(new User(3,"Adam3",LocalDate.now().minusYears(30)));
	}
	public List<User> findAll(){
		return users;
	}
	
//	public User findOne(int id) {
//		Predicate<? super User> predicate = user -> 
//				user.getId().equals(id);
//	}
	
}

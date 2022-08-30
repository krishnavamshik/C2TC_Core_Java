package com.cg.user;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private IUserService service;
	
	//add user
	@PostMapping("/user")
	public void add(@PathVariable User user) {
		service.addUser(user);
	}
	//update user
	@PutMapping("/user/{uid}")
	public ResponseEntity<?>update(@PathVariable User user,int uid,String name,String Password){
		try {
			User existuser = service.login(uid,name,Password);
			service.addUser(user);
			return new ResponseEntity<>(user,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	// Delete user
	@DeleteMapping("/user/{uid}")
	public void delete(@PathVariable int uid) {
		service.logOut();
	}

}

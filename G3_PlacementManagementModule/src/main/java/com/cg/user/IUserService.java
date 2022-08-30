package com.cg.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IUserService {
	@Autowired
	private IUserRepository repo;
	
	public void addUser(User user) {
		repo.save(user);
	}
	public User login(int aid,String name,String password) {
		return repo.findById(aid).get();	
	}
	public void logOut() {
	}

}

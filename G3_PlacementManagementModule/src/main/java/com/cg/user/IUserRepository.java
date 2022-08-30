package com.cg.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository  extends JpaRepository<User,Integer> {

}

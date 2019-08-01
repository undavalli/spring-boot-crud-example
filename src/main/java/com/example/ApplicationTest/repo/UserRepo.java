package com.example.ApplicationTest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ApplicationTest.pojo.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	

}

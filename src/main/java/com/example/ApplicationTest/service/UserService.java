package com.example.ApplicationTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApplicationTest.pojo.User;
import com.example.ApplicationTest.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	List<User> user = new ArrayList<>();

	
	
	public void addData(){
	
		for(int i=1;i<10;i++){
			User user1 = new User();
			user1.setId((long)i);
			user1.setFirstName("Raj");
			user1.setLastName("undavalli");
			user.add(user1);
		}
		
		userRepo.saveAll(user);
		
	}
	
	public List findData(){
		return (List) userRepo.findAll();
	}
	
	public Long count(){
		return userRepo.count();
	}
	
	public boolean delete(Long id){
		userRepo.deleteById(id);
		return "deleted user " +id != null; 
	}

}

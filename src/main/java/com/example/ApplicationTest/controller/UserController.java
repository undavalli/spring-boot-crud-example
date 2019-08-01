package com.example.ApplicationTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApplicationTest.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(path="/addData")
	public String addData(){
		userService.addData();
		return "Data added";
	}
	
	@GetMapping("/showData")
	public List showData(){
		return userService.findData();
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable long id){ 
		boolean isRemoved = userService.delete(id);
		if(!isRemoved){
			return "id " +id + "not found" ;
		}
		return "Id " + id + " deleted";
	}

}

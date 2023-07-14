package com.spring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.user.model.User;
import com.spring.user.service.UserService;

@RestController
@RequestMapping("/api/users")

public class UserController 
{
	@Autowired
	
	public UserService userService;
	
	
	@GetMapping
	public List<User> getAllUser()
	{
		return userService.getAll();
	}
	
	@PostMapping
	public String addUser(@RequestBody User user)
	{
		userService.addUser(user);
		return "added";
	}
	
	/*@GetMapping("{id}")
	public User getId(@PathVariable("id") int id)
	{
	
		return userService.getById(id);
	}
	*/
	
	@PutMapping("{id}")
	public String updateUser( @PathVariable("id") int id,@RequestBody User user )
	{
		 user.setId(id);
	       userService.update( id,user);
	        return "updated";
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") int id)
	{
	  userService.deleteUser(id);
		return "deleted";
		
	}
	
	
	 

}

package com.spring.user.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.user.model.User;
import com.spring.user.repository.UserRepository;

@Service
public class UserService 
{
	
	@Autowired
	public UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) 
	{

		this.userRepository = userRepository;
	}

	public List<User> getAll()
	{
		List<User> user = new ArrayList<>();
		userRepository.findAll().forEach(user::add);
		return user;
	}

	public void addUser(User user)
	{
		userRepository.save(user);
	}
	
	public User getById(int id)
	{
		return userRepository.findById(id).get();
	}
	
	public User update(int id,User user)
	{
		 User existingUser = userRepository.findById(user.getId()).get();
	        existingUser.setName(user.getName());
	        existingUser.setEmail(user.getEmail());
	        User updatedUser = userRepository.save(existingUser);
	        return updatedUser;
	}
	
	
	public void deleteUser(int id)
	{
		userRepository.deleteById(id);
	}
	

}

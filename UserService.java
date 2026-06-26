package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.exception.UserNotFoundException;
import com.demo.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User saveUser(User user) {
		 return repository.save(user);
	 }
	
	public List<User> getAllUsers(){
		
		return repository.findAll()
;	}
	
	public User getById(Integer id)
	{
		return repository.findById(id).orElseThrow( ()->new UserNotFoundException("User not found for given id: "+id) ); 
	}
	
	public void delete(Integer id)
	{
		repository.findById(id).orElseThrow( ()->new UserNotFoundException("User not found for given id: "+id) ); 
		repository.deleteById(id);
	}
	
	public User update(Integer id, User user)
	{
		User existingUser = repository.findById(id).orElseThrow( ()->new UserNotFoundException("User not found for given id: "+id) ); 
		
		existingUser.setName(user.getName());
		existingUser.setAddress(user.getAddress());
		existingUser.setEmail(user.getEmail());
		existingUser.setAge(user.getAge());
		
		User savedUser = repository.save(existingUser);
		return savedUser;
	}
}

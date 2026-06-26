package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.UserDto;
import com.demo.entity.User;
import com.demo.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping
	public ResponseEntity<?> createUser(@Valid @RequestBody UserDto userDto, BindingResult result) {
		
		if(result.hasErrors()) {
			
			Map<String, String> errors = new HashMap<String, String>();
			
			for(FieldError error:result.getFieldErrors())
			{
				errors.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
		}
		
		
		User user = new User();
		
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setAddress(userDto.getAddress());
		user.setEmail(userDto.getEmail());
		user.setAge(userDto.getAge());
		
		service.saveUser(user);
		
		return new ResponseEntity<>("User is valid & saved successfully", HttpStatus.OK);

   }
	
	@GetMapping
	public List<User> getAll(){
		
		return service.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable Integer id)
	{
		return service.getById(id);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletebyId(@PathVariable Integer id) {
		
		service.delete(id);
		return new ResponseEntity<>("User is deleted successfully", HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Integer id,@RequestBody User user)
	{
		return service.update(id, user);
		
	}
}

package com.wcs.WebService2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.WebService2.exception.UserNotFoundException;
import com.wcs.WebService2.model.User;
import com.wcs.WebService2.servicei.UserserviceI;

@RestController
public class UserController {
	
	@Autowired
	UserserviceI usi;
	
	  @RequestMapping(value="/user",method=RequestMethod.POST)
	  public User saveUser(@RequestBody User u) {
		 User u1 =usi.saveUser(u);
		 return u1; 
	  }
	
	
	  @RequestMapping(value="/users",method=RequestMethod.GET)
	  public List<User> getAllUsers(){
		  List<User> list=usi.getAllUsers();
		return list;
		  
	  }
	  
	  @GetMapping(value="/user/{uid}")
	  public User getSingleUser(@PathVariable int uid) {
		  
		  User u=usi.getSingleUser(uid);
		  if(u!=null) {
				return u; 
		  }
		  else {
	       throw new UserNotFoundException("Requested user is not available");
		  }
	  }
	  
	  @DeleteMapping(value="/user/{uid}")
	  public String deleteUser(@PathVariable int uid) {
		  usi.deleteUser(uid);
		  return "User deleted Successfully...";
	  }
	  
	  
	 
	  @PutMapping(value="user/{uid}")
	  public User updateUser(@PathVariable int uid, @RequestBody User u) {
		  
		  User u2 =usi.updateUser(uid,u);
		  System.out.println(u2.getName());
			 return u2; 
		  
	  }
	  
	  @ExceptionHandler(UserNotFoundException.class)
	  public String usernotfound( UserNotFoundException e) {
		 return e.getMessage();
	  }
	
}

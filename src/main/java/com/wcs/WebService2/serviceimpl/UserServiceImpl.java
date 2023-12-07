package com.wcs.WebService2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.WebService2.model.User;
import com.wcs.WebService2.repository.UserRepository;
import com.wcs.WebService2.servicei.UserserviceI;
@Service
public class UserServiceImpl implements  UserserviceI {
     @Autowired
     UserRepository ur;
	@Override
	public User saveUser(User u) {
	User u1=ur.save(u);
		return u1;
	}

	@Override
	public List<User> getAllUsers() {
	
		return (List<User>) ur.findAll();
	}


	@Override
	public User getSingleUser(int uid) {
		User u=ur.findByUid(uid);
		return u;
	}

	@Override
	public void deleteUser(int uid) {
		ur.deleteById(uid);
		
	}

	@Override
	public User updateUser(int uid, User u) {
		User u1=new User();
		u1.setUid(uid);
		u1.setName(u.getName());
		u1.setUsername(u.getUsername());
		u1.setPassword(u.getPassword());
		u1.setMobno(u.getMobno());
		u1.setEmail(u.getEmail());
	
		return 	ur.save(u1);
	}

	

}

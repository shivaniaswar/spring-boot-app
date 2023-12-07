package com.wcs.WebService2.servicei;

import java.util.List;

import com.wcs.WebService2.model.User;

public interface UserserviceI {

public User saveUser(User u);
public List<User> getAllUsers();
public User getSingleUser(int uid);
public void deleteUser(int uid);
public User updateUser(int uid, User u);




}

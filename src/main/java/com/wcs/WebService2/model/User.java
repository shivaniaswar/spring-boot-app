package com.wcs.WebService2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class User {
		
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
private int uid;
private String name;
private String username;
private String password;
private String mobno;
private String email;
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobno() {
	return mobno;
}
public void setMobno(String mobno) {
	this.mobno = mobno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}

package com.ebox;

public class UserCredentials {
 private int id;
 private String username;
 private String password;
 public UserCredentials(int id,String username,String password ) {
	 this.id=id;
	 this.username=username;
	 this.password=password;
 }
 public UserCredentials() {
	 //this(null,null,null);
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
 
}

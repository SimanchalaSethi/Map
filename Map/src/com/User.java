package com;

public class User {
	  String userId;
      String name;
      String email;
      User(String userId, String name, String email){
    	  this.userId=userId;
    	  this.name=name;
    	  this.email=email;
      }
	@Override
	public String toString() {
		return "[userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}
}

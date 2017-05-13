package com;

public class User {
	private String username;
	private String email;
	private String password;
	private String repassword;
	private String msg=" ";
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getMessage() {
		return msg;
	}
	

	

	public boolean validate(){
		if((this.username==null || this.username=="") && (this.email==null || this.email==""  )){
	    		msg="Enter Details";
	    		return false;
	    	}
	    else if(this.username==null || this.username==""){
			msg="Enter Username";
			return false;
		}
		else if(this.email==null || this.email==""){
			msg="Enter email";
			return false;
		}
		else if(this.password==null || this.password==""){
			msg="Enter Password";
			return false; 
		}
		else if(this.repassword==null || this.repassword==""){
			msg="Enter Password again";
			return false;
		}
		else if(!this.password.equals(this.repassword)){
			msg="Password does not match";
			return false;
		}
		 
		else{
		return true;
		}
	}
		
}
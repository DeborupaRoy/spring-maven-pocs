package edu.deborupa.spring.Bean;

import java.util.ArrayList;

public class LoginBean {
	private String username;
	private String password;
	private ArrayList<String> pages = new ArrayList<String>();
	
	/* SETTER METHODS*/
	public void setusername(String username) {
		this.username = username;
	}
	
	 public void setpassword(String password) {
		 this.password = password;
	 }
	 
	 public void setpagelist(ArrayList<String> pages)
	 {
		 this.pages =(ArrayList<String>)pages.clone();
	 }
	 
	 /* GETTER METHODS */
	 public String getusername()
	 {
		 return username;
	 }
	 
	 public String getpassword() {
		return password;
	}
	 
	 public ArrayList<String> getpages() {
		return pages;
	}
	 
	 

}

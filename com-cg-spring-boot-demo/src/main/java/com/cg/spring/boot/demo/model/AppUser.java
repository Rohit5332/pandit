package com.cg.spring.boot.demo.model;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// USER class 

public class AppUser implements Serializable {

	private final Logger log = LoggerFactory.getLogger(AppUser.class);

	private static final long serialVersionUID = 1L;

//	private int id;
	private String username;
	private String password;

	public AppUser() {
		super();
		log.info("AppUser default constructor");
	}

	public AppUser(String username, String password) {
		log.info("AppUser parameterized constructor");
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		log.info("getUsername");
		return username;
	}

	public void setUsername(String username) {
		log.info("setUsername");
		this.username = username;
	}

	public String getPassword() {
		log.info("getPassword");
		return password;
	}

	public void setPassword(String password) {
		log.info("setPassword");
		this.password = password;
	}
}
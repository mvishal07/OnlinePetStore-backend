package com.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class LoginEntity {
	@Id
	private String email;
	private String password;
	private String name;
	public LoginEntity(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LoginEntity(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
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
	
}

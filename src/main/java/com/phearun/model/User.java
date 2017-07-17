package com.phearun.model;

import java.util.List;

public class User{
	
	private int id;
	private String username;
	private String password;
	private List<Role> roles;
	private boolean status;
	
	public User() {
		super();
	}
	public User(int id, String username, String password, List<Role> roles, boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.status = status;
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
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + ", status="
				+ status + "]";
	}
}

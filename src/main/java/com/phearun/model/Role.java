package com.phearun.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String role;
	
	public Role() {
		super();
	}
	public Role(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}
	@Override
	public String getAuthority() {
		return "ROLE_" + role;
	}
}

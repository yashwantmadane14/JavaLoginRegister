package com.Register.Bean;

public class RegisterBean {
	private String name;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public RegisterBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterBean(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
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

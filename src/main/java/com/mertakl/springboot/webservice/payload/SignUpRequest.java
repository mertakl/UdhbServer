package com.mertakl.springboot.webservice.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequest {
	@NotBlank
	@Size(min = 4, max = 40)
	private String firstName;

	@NotBlank
	@Size(min = 4, max = 40)
	private String lastName;

	@NotBlank
	@Size(min = 3, max = 15)
	private String userName;

	@NotBlank
	@Size(max = 40)
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
package com.Owner.Models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "OwnerInformation")
public class OwnerInformation {

	@Id
	private String id;
	private String email;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public OwnerInformation() {
		super();
	}

	public OwnerInformation(String id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "OwnerInformation [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}
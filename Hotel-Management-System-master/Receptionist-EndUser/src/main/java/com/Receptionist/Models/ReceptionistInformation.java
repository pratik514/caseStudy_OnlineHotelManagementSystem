package com.Receptionist.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;

@Document(collection = "ReceptionistInformation")
public class ReceptionistInformation {

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

	public ReceptionistInformation(String id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public ReceptionistInformation() {
		super();
	}

	@Override
	public String toString() {
		return "ReceptionistInformation [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}
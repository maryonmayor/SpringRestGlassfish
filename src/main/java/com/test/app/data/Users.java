package com.test.app.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {

	@JsonProperty("users")
	List<User> users;

	@JsonProperty("users")
	public List<User> getUsers() {
		return users;
	}

	@JsonProperty("users")
	public void setUsers(List<User> users) {
		this.users = users;
	}

}

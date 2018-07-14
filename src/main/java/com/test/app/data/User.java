package com.test.app.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "age" })
public class User {

	@JsonProperty("name")
	private String name;
	@JsonProperty("age")
	private int age;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("age")
	public int getAge() {
		return age;
	}

	@JsonProperty("age")
	public void setAge(int age) {
		this.age = age;
	}

}
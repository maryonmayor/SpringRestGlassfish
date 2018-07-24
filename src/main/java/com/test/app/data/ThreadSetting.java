package com.test.app.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "thread_setting_tbl")
public class ThreadSetting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private int id;

	@JsonProperty("thread")
	@Column(name = "number_of_threads")
	private int numberOfThreads;

	@JsonProperty("thread")
	public int getNumberOfThreads() {
		return numberOfThreads;
	}

	@JsonProperty("thread")
	public void setNumberOfThreads(int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}

	@JsonProperty("id")
	public int getId() {
		return id;
	}

}

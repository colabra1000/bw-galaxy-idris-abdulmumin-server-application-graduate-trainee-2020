package com.bw.galaxytm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	@Column(nullable=true)
	private String short_description;
	private boolean completed = false;
	private Long owner;
	
	@Column(nullable = true)
	private String created_on = String.valueOf(new Date().getTime());
//	private String due_date;
	
	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public Task() {
		super();
	}
	
	public Task(String description, String short_description, boolean completed, Long owner) {
		super();
		this.description = description;
		this.short_description = short_description;
		this.completed = completed;
		this.owner = owner;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Long getOwner() {
		return owner;
			
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}
	
}

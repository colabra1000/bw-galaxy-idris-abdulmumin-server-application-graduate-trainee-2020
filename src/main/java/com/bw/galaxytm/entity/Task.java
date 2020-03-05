package com.bw.galaxytm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private String created_on = "";
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

	public String getName() {
		return description;
	}

	public void setName(String description) {
		this.description = description;
	}

	public String getShort_desc() {
		return short_description;
	}

	public void setShort_desc(String short_description) {
		this.short_description = short_description;
	}


	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

//	public User getOwner() {
//		return owner;
//	}

//	public void setOwner(User owner) {
//		this.owner = owner;
//	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", short_description=" + short_description
				+ ", completed=" + completed + ", owner=" + owner + "]";
	}

	
	
	

}

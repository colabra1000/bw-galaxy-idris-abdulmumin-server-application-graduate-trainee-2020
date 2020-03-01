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
	private String name;
	private String short_desc;
	private boolean completed = false;
	
	private Long owner;
//	private String due_date;
	
	public Task() {
		super();
	}
	
	public Task(String name, String short_desc, boolean completed, Long owner) {
		super();
		this.name = name;
		this.short_desc = short_desc;
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
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
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
		return "Task [id=" + id + ", name=" + name + ", short_desc=" + short_desc
				+ ", completed=" + completed + ", owner=" + owner + "]";
	}

	
	
	

}

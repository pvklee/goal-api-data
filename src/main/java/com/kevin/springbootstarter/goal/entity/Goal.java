package com.kevin.springbootstarter.goal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Goal {
	
	@Id
	private String id;
	
	
	private String name;
	
	
	private String description;
	
	public Goal() {
	}

	public Goal(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}

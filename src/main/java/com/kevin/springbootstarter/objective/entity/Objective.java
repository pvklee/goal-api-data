package com.kevin.springbootstarter.objective.entity;

import com.kevin.springbootstarter.goal.entity.Goal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Objective {
	
	@Id
	private String id;
	
	
	private String name;
	
	
	private String description;
	
	@ManyToOne
	private Goal goal;
	
	public Objective() {
	}

	public Objective(String id, String name, String description, String goalId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.goal = new Goal(goalId, "", "");
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

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	
	
	
	
}

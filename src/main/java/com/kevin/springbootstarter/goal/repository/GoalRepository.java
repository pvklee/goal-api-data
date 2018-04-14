package com.kevin.springbootstarter.goal.repository;

import com.kevin.springbootstarter.goal.entity.Goal;
import org.springframework.data.repository.CrudRepository;

public interface GoalRepository extends CrudRepository<Goal, String> {

	//getAllGoals()
	//getGoal(String id)
	//updateGoal(Goal t)
	//deleteGoal(Spring id)
	
	
}

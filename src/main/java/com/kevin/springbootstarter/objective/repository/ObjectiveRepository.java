package com.kevin.springbootstarter.objective.repository;

import com.kevin.springbootstarter.objective.entity.Objective;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ObjectiveRepository extends CrudRepository<Objective, String> {

	public List<Objective> findByGoalId(String goalId);
	
	//getAllGoals()
	//getGoal(String id)
	//updateGoal(Goal t)
	//deleteGoal(Spring id)
	
//	public List<Objective> findByName(String name);
//	public List<Objective> findByDescription(String description);
	
}

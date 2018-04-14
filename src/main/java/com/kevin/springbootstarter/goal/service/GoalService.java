package com.kevin.springbootstarter.goal.service;

import com.kevin.springbootstarter.goal.entity.Goal;
import com.kevin.springbootstarter.goal.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
//	private List<Goal> goals = new ArrayList<>(Arrays.asList(
//			new Goal("spring", "Spring Framework", "Description"),
//			new Goal("java", "Core Java", "Description"),
//			new Goal("javascript", "JavaScript", "Description")
//			));
	
	public List<Goal> getAllGoals() {
		List<Goal> goals = new ArrayList<>();
		goalRepository.findAll()
			.forEach(goals::add);
		return goals;
	}
	
	public Goal getGoal(String id) {
//		return goals.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Optional<Goal> goal = goalRepository.findById(id);
		if (goal.isPresent()) {
			return goal.get();
		} else {
			return null;
		}
	}

	public void addGoal(Goal goal) {
		goalRepository.save(goal);
	}

	public void updateGoal(String id, Goal goal) {
		goalRepository.save(goal);
	}

	public void deleteGoal(String id) {
		goalRepository.deleteById(id);
	}
	
	
}

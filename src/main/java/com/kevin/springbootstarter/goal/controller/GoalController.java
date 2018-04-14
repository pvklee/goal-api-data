package com.kevin.springbootstarter.goal.controller;

import com.kevin.springbootstarter.goal.service.GoalService;
import com.kevin.springbootstarter.goal.entity.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class GoalController {

	@Autowired
	private GoalService goalService;
	
	
	@RequestMapping("/goals")
	public List<Goal> getAllGoals() {
		return goalService.getAllGoals();
	}
	
	@RequestMapping("/goals/{id}")
	public Goal getGoal(@PathVariable String id) {
		return goalService.getGoal(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/goals")
	public void addGoal(@RequestBody Goal goal) {
		goalService.addGoal(goal);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/goals/{id}")
	public void updateGoal(@RequestBody Goal goal, @PathVariable String id) {
		goalService.updateGoal(id, goal);
	}
		
	@RequestMapping(method=RequestMethod.DELETE, value="/goals/{id}")
	public void deleteGoal(@PathVariable String id) {
		goalService.deleteGoal(id);
	}
		
	
}

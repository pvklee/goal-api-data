package com.kevin.springbootstarter.objective.controller;

import com.kevin.springbootstarter.goal.entity.Goal;
import com.kevin.springbootstarter.objective.service.ObjectiveService;
import com.kevin.springbootstarter.objective.entity.Objective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ObjectiveController {

	@Autowired
	private ObjectiveService objectiveService;
	
	
	@RequestMapping("/goals/{id}/objectives")
	public List<Objective> getAllObjectives(@PathVariable String id) {
		return objectiveService.getAllObjectives(id);
	}
	
	@RequestMapping("/goals/{goalId}/objectives/{objectiveId}")
	public Objective getObjective(@PathVariable String objectiveId) {
		return objectiveService.getObjective(objectiveId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/goals/{goalId}/objectives/{objectiveId}")
	public void addObjective(@RequestBody Objective objective, @PathVariable String goalId) {
		objective.setGoal(new Goal(goalId, "", ""));
		objectiveService.addObjective(objective);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/goals/{goalId}/objectives/{objectiveId}")
	public void updateObjective(@RequestBody Objective objective, @PathVariable String goalId) {
		objective.setGoal(new Goal(goalId, "", ""));
		objectiveService.updateObjective(objective);
	}
		
	@RequestMapping(method=RequestMethod.DELETE, value="goals/{goalId}/objectives/{id}")
	public void deleteObjective(@PathVariable String id) {
		objectiveService.deleteObjective(id);
	}
		
	
}

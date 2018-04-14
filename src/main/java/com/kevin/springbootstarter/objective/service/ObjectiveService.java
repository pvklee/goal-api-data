package com.kevin.springbootstarter.objective.service;

import com.kevin.springbootstarter.objective.entity.Objective;
import com.kevin.springbootstarter.objective.repository.ObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ObjectiveService {

	@Autowired
	private ObjectiveRepository objectiveRepository;
	
//	private List<Objective> objective = new ArrayList<>(Arrays.asList(
//			new Objective("spring", "Spring Framework", "Description"),
//			new Objective("java", "Core Java", "Description"),
//			new Objective("javascript", "JavaScript", "Description")
//			));
	
	public List<Objective> getAllObjectives(String goalId) {
		List<Objective> objectives = new ArrayList<>();
		objectiveRepository.findByGoalId(goalId)
			.forEach(objectives::add);
		return objectives;
	}
	
	public Objective getObjective(String id) {
//		return objective.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		Optional<Objective> objective = objectiveRepository.findById(id);
		if (objective.isPresent()) {
			return objective.get();
		} else {
			return null;
		}
	}

	public void addObjective(Objective objective) {
		objectiveRepository.save(objective);
	}

	public void updateObjective(Objective objective) {
		objectiveRepository.save(objective);
	}

	public void deleteObjective(String id) {
		objectiveRepository.deleteById(id);
	}
	
	
}

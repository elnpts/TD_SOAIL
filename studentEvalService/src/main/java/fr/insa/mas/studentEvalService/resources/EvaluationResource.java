package fr.insa.mas.studentEvalService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentEvalService.model.*;

@RestController
@RequestMapping("/evaluation")
public class EvaluationResource {
	
	@GetMapping("/{studentId}")
	public Evaluation getStudentEvaluation(@PathVariable("studentId") int studentID) {
		// Simulate the database with a list that contains the marks of 4 students
		List<Evaluation> evaluationList = Arrays.asList(
				new Evaluation(0, 13F),
				new Evaluation(1, 10.65F),
				new Evaluation(2, 18F),
				new Evaluation(3, 18F)
				);
		// Return the evaluation of the specified studentId
		return evaluationList.get(studentID);
	}

}

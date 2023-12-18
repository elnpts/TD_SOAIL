package fr.insa.mas.studentListService.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import fr.insa.mas.studentListService.model.*;

@RestController
@RequestMapping("/students")
public class StudentListResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("ids/{idSpeciality}")
	public StudentIDList getIDStudents(@PathVariable("idSpeciality") String speciality) {
		// Simulate the database using an object StudentIDList, which contains a list of integers
		StudentIDList studentsId = new StudentIDList();
		studentsId.addStudentToList(0);
		studentsId.addStudentToList(1);
		studentsId.addStudentToList(2);
		studentsId.addStudentToList(3);
		
		return studentsId;
	}
	
	@GetMapping("all/{idSpeciality}")
	public List<Student> getStudents(@PathVariable("idSpeciality") String speciality) {
		// Simulate the database using an object StudentIDList, which contains a list of integers
		StudentIDList studentsId = new StudentIDList();
		studentsId.addStudentToList(0);
		studentsId.addStudentToList(1);
		studentsId.addStudentToList(2);
		studentsId.addStudentToList(3);
		
		// Instanciate RestTemplate for Rest calls
		// RestTemplate restTemplate = new RestTemplate();
		int i = 0;
		List<Student> studentList = new ArrayList<Student>();
		
		while (i < studentsId.getStudentList().size()) {
			// Call the MS to get students information
			// The result is deserialized into StudentInfos java object
			//StudentInfos studentInfos = restTemplate.getForObject("http://localhost:8081/student/" + i, StudentInfos.class);
			StudentInfos studentInfos = restTemplate.getForObject("http://studentInfoService/student" + i, StudentInfos.class);
			// Call the MS to get the students evaluation
			// The result is deserialized into Evaluation java object
			//Evaluation eval = restTemplate.getForObject("http://localhost:8082/evaluation/" + i, Evaluation.class);
			Evaluation eval = restTemplate.getForObject("http://studentEvaluationService/evaluation" + i, Evaluation.class);
			// Instanciate a student with id, first name, last name and average and store it in the list
			studentList.add(new Student(i, studentInfos.getFirstName(), studentInfos.getLastName(), eval.getAverage()));
			i++;
		}
		
		return studentList;
	}
}

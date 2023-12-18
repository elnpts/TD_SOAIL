package fr.insa.mas.studentInfoService.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentInfoService.model.*;

@RestController
@RequestMapping("/student")
public class StudentInfoResource {
	
	@GetMapping("/{studentId}")
	public StudentInfos getStudentInfo(@PathVariable("studentId") int id) {
		// Simulate the database as a list
		List<StudentInfos> studentInfos = Arrays.asList(
				new StudentInfos(0, "Petersen", "Ellen", "04/11/1998"),
				new StudentInfos(1, "Phan", "Vanessa", "28/10/1999"),
				new StudentInfos(2, "Öjes", "Agnes", "29/05/1999"),
				new StudentInfos(3, "Efraimsson", "Alva", "12/01/1999")
		);
		// Get the student that corresponds to the id
		return studentInfos.get(id);
	}
}

package fr.insa.mas.studentManagement.controller;

//import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.mas.studentManagement.model.Student;

@RestController
public class StudentResource {
	
	@GetMapping("/students")
	public int studentNumber() {
		return 200;
	}
	
	@GetMapping("/students/{id}")
	public Student infosStudent(@PathVariable int id) {
		return new Student(id, "Rosa", "Parks");
	}
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_XML_VALUE)
	public Student xmlInfosStudent(@PathVariable int id) {
		return new Student(id, "Rosa", "Parks");
	}
}

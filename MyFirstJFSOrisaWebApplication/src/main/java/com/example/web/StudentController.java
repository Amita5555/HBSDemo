package com.example.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAll();
	}
	

}

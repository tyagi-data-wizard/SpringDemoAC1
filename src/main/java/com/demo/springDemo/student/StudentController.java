package com.demo.springDemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}


	@GetMapping
	public List<Student> getStudents() {
		//return List.of(new Student(1L,"Mary","marya@gmail.com",LocalDate.of(2000,01,25),22));
		return studentService.getStudents();
	}

}

package com.demo.springDemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> getStudents() {
		return List.of(new Student(1L,"Mary","marya@gmail.com",LocalDate.of(2000,01,25),22));
		
	}
}

package com.demo.springDemo;



import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	
//	  @GetMapping("/")
//	  public List<Student> hello() { return List.of(new
//	  Student(1L,"Mary","marya@gmail.com",LocalDate.of(2000,01,25),22)); }
	 
}

package com.example.HelloThymeleaf.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.HelloThymeleaf.domain.Student;


@Controller
public class StudentController {
	
	
	@GetMapping("/students/hello")
	public String students(Model model) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Kate", "Cole"));
		studentList.add(new Student("Dan", "Brown"));
		studentList.add(new Student("Mike", "Mars"));
		
		model.addAttribute("students", studentList);
		return "studentsList";
	}
}

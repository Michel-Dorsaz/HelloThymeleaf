package com.example.HelloThymeleaf.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(
			@RequestParam(name = "name") String name, 
			@RequestParam(name = "age") String age, 
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
	}



}
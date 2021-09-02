package com.example.HelloThymeleaf.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.HelloThymeleaf.domain.Friend;
import com.example.HelloThymeleaf.domain.Student;

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
	
	
	static ArrayList<Friend> friendList = new ArrayList<Friend>();
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("friend", new Friend());
		return "friendsForm";
	}
	
	@PostMapping("/index")
	public String formSubmit(
			@ModelAttribute Friend newFriend, 
			Model model) {	
			
		friendList.add(newFriend);
		
		model.addAttribute("friends", friendList);
		
		return "friendsForm";
	}
	
	
}
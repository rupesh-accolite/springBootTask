package com.example.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	Person person;
	
	@GetMapping("/name")
	public String getName() {
		return "Person name is "+person.getPersonName();
	}
	
	@GetMapping("/id")
	public String getId() {
		return "Person id is "+person.getPersonId();
	}
	
	
	

}

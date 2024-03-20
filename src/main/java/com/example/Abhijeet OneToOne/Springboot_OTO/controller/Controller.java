package com.example.numetry.Springboot_OTO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.numetry.Springboot_OTO.dto.Person;
import com.example.numetry.Springboot_OTO.service.PersonService;

@RestController
public class Controller {
	
	@Autowired
	PersonService personService;

	@PostMapping("/save")
	private Person savePerson(@RequestBody Person person)
	{
		 personService.savePerson(person);
		return person;
	}
	
	@GetMapping("/getall")
	private List<Person> getAllPerson()
	{
		return personService.getAllPerson();
		
	}
	
	@GetMapping("/getbyid/{id}")
	private Person getPersonById(@PathVariable int id) {
		return personService.getPersonById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	private Person deletePersonById(@PathVariable int id) {
		return personService.deletePersonById(id);
	
	}
	
	@PatchMapping("/update/{id}")
	private Person updatePersonById(@RequestBody Person person, @PathVariable int id)
	{
		return personService.updatePersonById(person, id);
	}

	
	
}

package com.example.numetry.Springboot_OTO.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.numetry.Springboot_OTO.Repository.PersonRepo;
import com.example.numetry.Springboot_OTO.dto.Person;


@Service

public class PersonService {

	@Autowired
	private PersonRepo repo;
	
	public void savePerson(Person person) {
		repo.save(person);
		
	}
	
	public List<Person> getAllPerson()
	{
		List<Person> persons= new ArrayList<Person>();
		repo.findAll().forEach(person1 -> persons.add(person1));
		return persons;
	}
	
	public Person getPersonById(int id)
	{
		Optional<Person> optional = repo.findById(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
	
	public Person deletePersonById(int id)
	{
		Optional<Person> optional = repo.findById(id);
		
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}
	
	public Person updatePersonById(Person person, int id)
	{
		Optional<Person> optional =repo.findById(id);
		if(optional.isPresent())
		{
			person.setId(id);
			repo.save(person);
		}
		return  null;
	
	}

}

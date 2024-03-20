package com.example.numetry.Springboot_OTO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.numetry.Springboot_OTO.dto.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

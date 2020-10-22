package com.formation.mescv.controller;

import com.formation.mescv.dao.IPersonRepository;
import com.formation.mescv.entities.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

	private IPersonRepository iPersonRepository;

	public PersonController(IPersonRepository iPersonRepository) {
		this.iPersonRepository = iPersonRepository;
	}

	@GetMapping
	public List<Person> findAll() {
		return iPersonRepository.findAll();
	}
}

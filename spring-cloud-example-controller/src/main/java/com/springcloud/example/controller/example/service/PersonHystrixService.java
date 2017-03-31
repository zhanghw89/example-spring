package com.springcloud.example.controller.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.example.controller.example.domain.Person;

@Service
public class PersonHystrixService {

	@Autowired
	PersonService personService;

	@HystrixCommand(fallbackMethod="fallbackSave")
	public List<Person> save(String name) {
		return personService.save(name);
	}

	public List<Person> fallbackSave() {
		List<Person> persons = new ArrayList<>();
		Person p = new Person();
		p.setName("testUser");
		persons.add(p);
		return persons;
	}

}

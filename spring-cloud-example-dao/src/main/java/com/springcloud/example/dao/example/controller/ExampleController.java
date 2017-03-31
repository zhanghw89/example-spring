package com.springcloud.example.dao.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.example.dao.example.dao.PersonDao;
import com.springcloud.example.dao.example.domain.Person;

@RestController
public class ExampleController {
	@Autowired
	private PersonDao personDao;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public List<Person> savePerson(@RequestBody String personName) {
		Person person = new Person();
		person.setName(personName);
		personDao.save(person);
		List<Person> persons = personDao.findAll();
		return persons;
	}
}

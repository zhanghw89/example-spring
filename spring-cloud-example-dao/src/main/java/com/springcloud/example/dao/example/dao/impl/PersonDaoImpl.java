package com.springcloud.example.dao.example.dao.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.springcloud.example.dao.example.dao.PersonDao;
import com.springcloud.example.dao.example.domain.Person;

/**
 * 模拟查询数据库
 * 
 * @author zhanghw
 */
@Repository
public class PersonDaoImpl implements PersonDao {
	private static final List<Person> persons = new CopyOnWriteArrayList<>();

	@Override
	public void save(Person person) {
		persons.add(person);
	}

	@Override
	public List<Person> findAll() {
		return persons;
	}

}

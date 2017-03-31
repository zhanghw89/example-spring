package com.springcloud.example.dao.example.dao;

import java.util.List;

import com.springcloud.example.dao.example.domain.Person;

public interface PersonDao {
	/**
	 * 保存person
	 * 
	 * @param personName
	 */
	void save(Person person);

	/**
	 * 查询所有person对象
	 * 
	 * @return person列表
	 */
	List<Person> findAll();

}

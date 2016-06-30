package com.ws.dao;

import java.util.List;

import com.ws.model.Person;

public interface PersonMapper {

	void insert(Person person);
	
	List<Person> queryAll();
}

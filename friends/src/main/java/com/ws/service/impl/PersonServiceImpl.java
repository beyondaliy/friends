package com.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.dao.PersonMapper;
import com.ws.model.Person;
import com.ws.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {
	
	private PersonMapper personMapper;
	

	public PersonMapper getPersonMapper() {
		return personMapper;
	}

	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}


	public List<Person> loadPersons(){
		return personMapper.queryAll();
	}
}

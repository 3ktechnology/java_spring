package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.PersonDao;
import com.mvc.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public void addPerson(Person p) {
		personDao.addPerson(p);
		
	}

	@Override
	public List<Person> listPersons() {
		return personDao.listPersons();
	}

	
	

}

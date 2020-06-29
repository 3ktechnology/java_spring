package com.mvc.service;

import java.util.List;

import com.mvc.entity.Person;

public interface PersonService {

	public void addPerson(Person p);
	public List<Person> listPersons();
}

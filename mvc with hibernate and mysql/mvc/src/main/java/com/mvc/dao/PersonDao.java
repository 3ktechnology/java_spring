package com.mvc.dao;

import java.util.List;

import com.mvc.entity.Person;

public interface PersonDao {
	
	public void addPerson(Person p);
	public List<Person> listPersons();

}

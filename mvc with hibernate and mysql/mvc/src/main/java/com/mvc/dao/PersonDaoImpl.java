package com.mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.entity.Person;
@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
	
@Autowired 
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf){
		
		this.sessionFactory = sf;
	}

	public void addPerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession(); 
		  
		session.save(p);    
		  
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		return personsList;
	}

}
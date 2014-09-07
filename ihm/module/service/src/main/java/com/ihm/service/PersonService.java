package com.ihm.service;

import java.util.List;

import  com.ihm.model.Person;

public interface PersonService {

	public abstract void addPerson(Person p);
	public abstract void updatePerson(Person p);
	public abstract List<Person> listPersons();
	public abstract Person getPersonById(long id);
	public abstract List<Person> getPersonByName(String name);
	public abstract void removePerson(long id);
	
	
	
	
}

package com.ihm.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ihm.dao.PersonDAO;
import com.ihm.model.Person;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {

	@PersistenceContext
	private EntityManager em;
	
	// PersonDAO is injected...
    @Autowired
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public void addPerson(Person p) {
		this.personDAO.save(p);
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.save(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.findAll();
	}

	@Override
	@Transactional
	public Person getPersonById(long id) {
		return this.personDAO.findOne(id);
	}

	@Override
	@Transactional
	public List<Person> getPersonByName(String lastname){
	    TypedQuery query = em.createQuery("select c from Person c where c.lastname = ?1", Person.class);

	    query.setParameter(1, lastname);
	    query.setFirstResult(1 * 10);
	    query.setMaxResults(100);

	    return query.getResultList();
	}
	
	@Override
	@Transactional
	public void removePerson(long id) {
		this.personDAO.delete(id);
	}

}

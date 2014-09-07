package com.ihm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ihm.model.Person;

public interface PersonDAO extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

}


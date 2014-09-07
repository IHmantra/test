package com.ihm.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 *
 */
@Entity
@Table(name="PERSON")
public class Person implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="person_seq_gen")
	@SequenceGenerator(name="person_seq_gen", sequenceName="PERSON_SEQ", allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String country;
	
	private Date createdDate = Calendar.getInstance().getTime();
	
	private Integer valueOne;
	private Double valueTwo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@JsonSerialize(using=DateSerializer.class)
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
	
	public Integer getValueOne() {
		return valueOne;
	}

	public void setValueOne(Integer valueOne) {
		this.valueOne = valueOne;
	}

	public Double getValueTwo() {
		return valueTwo;
	}

	public void setValueTwo(Double valueTwo) {
		this.valueTwo = valueTwo;
	}

	@Override
	public String toString(){
		return "id="+id+", name="+name+", country="+country;
	}
}

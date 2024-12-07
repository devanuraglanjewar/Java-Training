package com.tka.entityClasses;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	@Temporal(value = TemporalType.DATE)
	Date bdate;
	
	
	@Transient
	boolean x;
	
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Test(String name, Date bdate) {
		super();
		this.name = name;
		this.bdate = bdate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBdate() {
		return bdate;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	public boolean isX() {
		return x;
	}


	public void setX(boolean x) {
		this.x = x;
	}
	
	
	
	

}

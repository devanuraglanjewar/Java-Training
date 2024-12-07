package com.tka.entityclasses;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee1 {
	@Id
	int empid;
	String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee1(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

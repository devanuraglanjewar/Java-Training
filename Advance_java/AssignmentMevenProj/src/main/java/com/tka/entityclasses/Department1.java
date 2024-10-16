package com.tka.entityclasses;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	
	private String dname;
	private String loc;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="did")
	private List<Employee1> empList;
	

	public Department1(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}


	public Department1(String dname, String loc, List<Employee1> empList) {
		super();
		this.dname = dname;
		this.loc = loc;
		this.empList = empList;
	}

	
	public Department1(String dname) {
		super();
		this.dname = dname;
	}


	public Department1(String dname, List<Employee1> empList) {
		super();
		this.dname = dname;
		this.empList = empList;
	}

	public Department1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employee1> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee1> empList) {
		this.empList = empList;
	}
	
	
	
	
	
	
	
	
}

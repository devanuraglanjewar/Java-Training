package com.tka.springdemo;


public class Employee {
	private int eid;
	private String ename;
	private String edept;
	private int age;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public Employee(int eid, String ename, String edept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

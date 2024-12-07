package com.jbk.day16Collection;

public class Employee1 implements Comparable<Employee1>  {
	private int id;
	private String name;
	private String dept;
	private String role;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", dept=" + dept + ", role=" + role + ", salary=" + salary
				+ "]";
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee1() {
		
	}
	
	public Employee1(int id, String name, String dept, String role, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.role = role;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee1 o) {
		Integer i1 = this.id;
		Integer i2 = o.id;
		return i1.compareTo(i2);
	}
	
	
	
}

package com.tka.entityClasses;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	private String fname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fid")
	private List<FacultySubject> fsubList;

	public Faculty(String fname, List<FacultySubject> fsubList) {
		super();
		this.fname = fname;
		this.fsubList = fsubList;
	}

	public Faculty(String fname) {
		super();
		this.fname = fname;
	}

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<FacultySubject> getFsubList() {
		return fsubList;
	}

	public void setFsubList(List<FacultySubject> fsubList) {
		this.fsubList = fsubList;
	}

	
	
	
	
	

}

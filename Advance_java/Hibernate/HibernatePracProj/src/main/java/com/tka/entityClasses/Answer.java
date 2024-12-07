package com.tka.entityClasses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	int aid;
	String answer;
	public int getId() {
		return aid;
	}
	public void setId(int id) {
		this.aid = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int aid, String answer) {
		super();
		this.aid = aid;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

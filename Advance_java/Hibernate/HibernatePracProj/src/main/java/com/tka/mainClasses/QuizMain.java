package com.tka.mainClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Answer;
import com.tka.entityClasses.Question;

public class QuizMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Question.class);
		cfg.addAnnotatedClass(Answer.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Question q1 = new Question();
//		q1.setQuestion("What is java?");
//		
//		Question q2 = new Question();
//		q2.setQuestion("What is Hibernate?");
//		session.save(q1);
//		session.save(q2);
		
		
//		Answer a1 = new Answer();
//		a1.setId(101);
//		a1.setAnswer("java is OOP language");
//		
//		Answer a2 = new Answer();
//		a2.setId(102);
//		a2.setAnswer("Hibernate is ORM Tool");
//		session.save(a1);
//		session.save(a2);
//
//		q1.setAnswer(a1);
//		q2.setAnswer(a2);
//			
//		
//		Transaction tx = session.beginTransaction();
//		tx.commit();
		
		Question q1 = session.load(Question.class, 1);
		System.out.println(q1.getQuestion()+": "+q1.getAnswer().getAnswer());
//		
		
		
		factory.close();
	}
}

package com.tka.mainClasses;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tka.entityClasses.Test;

public class TestMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Test.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		Test t = new Test ("Eesha",new Date());
		
		session.save(t);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Record inserted successfully");
	}

}

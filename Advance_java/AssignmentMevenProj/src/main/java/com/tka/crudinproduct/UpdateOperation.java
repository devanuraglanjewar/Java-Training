package com.tka.crudinproduct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateOperation {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		Product product = new Product(1,"Washing Machine", "Electronics",40000);
		
		session.update(product);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Record updated successfully");
	}

}

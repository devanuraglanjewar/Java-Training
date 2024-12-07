package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Product;

public class HQL {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		//		HQL
		Query query = session.createQuery("from Product");
		
		List<Product> p = query.list();
		for(Product p1 : p) {
			System.out.println(p1.getPname()+" "+p1.getPrice());
		}
		
		
	}

}

package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Product;

public class HQLSelectSingleColumn {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("select ptype from Product");
		
		List<String> pl = query.list();
		
		for(String p :pl) {
			System.out.println(p);
		}
	}
}

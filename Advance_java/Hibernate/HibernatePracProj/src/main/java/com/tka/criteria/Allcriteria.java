package com.tka.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tka.entityClasses.Product;

public class Allcriteria {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Product.class);
		c.add(Restrictions.eq("price", 300));
		List<Product> result = c.list();
		for(Product p : result) {
			
		}
	}

}

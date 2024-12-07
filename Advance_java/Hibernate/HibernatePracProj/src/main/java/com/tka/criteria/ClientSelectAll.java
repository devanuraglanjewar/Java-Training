package com.tka.criteria;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Product;
import com.tka.entityClasses.Test;

public class ClientSelectAll {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Product.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Product.class);
		List<Product> result = c.list();
		for(Product p : result) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice()+" "+p.getPtype());
		}
		
		
		
		
		
	}

}

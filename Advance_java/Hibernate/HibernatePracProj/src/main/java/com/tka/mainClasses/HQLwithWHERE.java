package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Product;

public class HQLwithWHERE {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Query query = session.createQuery("from Product where ptype =:c");
		query.setParameter("c", "Electronics");
		
		List<Product>p = query.list();
		
		for(Product p1 : p) {
			System.out.println(p1.getPid()+" "+p1.getPname());
		}
	}
}

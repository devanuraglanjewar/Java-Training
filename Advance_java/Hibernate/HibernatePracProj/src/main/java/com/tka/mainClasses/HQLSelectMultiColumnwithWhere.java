//Select pname ptype from product where price is >= 10000 using HQL
package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Product;

public class HQLSelectMultiColumnwithWhere {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Query query = session.createQuery("select pname , ptype, price from Product where price >=:c ");
		query.setParameter("c", 10000);
		
		List<Object[]> results = query.list();
		for(Object [] a : results ) {
			for(Object b: a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}
}

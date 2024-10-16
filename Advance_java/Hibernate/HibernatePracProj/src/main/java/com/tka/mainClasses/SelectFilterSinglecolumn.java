package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tka.entityClasses.Product;

public class SelectFilterSinglecolumn {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		@SuppressWarnings("unused")
		Criteria c = session.createCriteria(Product.class);
		
		c.add(Restrictions.gt("price", 400));
		
//		select pname from product
		Projection p = Projections.property("ptype");
		c.setProjection(p);
		
		List<String> li = c.list();
		for(String l : li) {
			System.out.println(l);
		}
		
	}
}

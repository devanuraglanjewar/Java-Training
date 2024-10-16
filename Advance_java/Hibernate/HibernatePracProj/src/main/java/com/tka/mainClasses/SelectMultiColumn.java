
package com.tka.mainClasses;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.tka.entityClasses.Product;

public class SelectMultiColumn {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		@SuppressWarnings("unused")
		Criteria c = session.createCriteria(Product.class);
		
		Projection p1 = Projections.property("pname");
		Projection p2 = Projections.property("ptype");
		Projection p3 = Projections.property("price");
		
		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		c.setProjection(plist);
		List<Object []> l =c.list();
		for(Object [] a : l ) {
			for(Object b: a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}
}

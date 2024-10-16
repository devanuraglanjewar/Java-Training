package com.tka.mainClasses;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entityClasses.Faculty;
import com.tka.entityClasses.FacultySubject;

public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Faculty.class);
		cfg.addAnnotatedClass(FacultySubject.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Faculty f1 = new Faculty("Anurag");
		
//		FacultySubject fs1 = new FacultySubject();
//		fs1.setSid(101);
//		fs1.setSubname("java");
//		
//		FacultySubject fs2 = new FacultySubject();
//		fs2.setSid(102);
//		fs2.setSubname("Spring");

//		FacultySubject fs3 = new FacultySubject();
//		fs3.setSid(103);
//		fs3.setSubname("Hibernate");
//		
//		ArrayList<FacultySubject> fsubList = new ArrayList<FacultySubject>();
//		
//		fsubList.add(fs1);
//		fsubList.add(fs2);
//		fsubList.add(fs3);
//		f1.setFsubList(fsubList);
//		
//		session.save(f1);
		Transaction tx = session.beginTransaction();
		tx.commit();
		
		Faculty f =  session.load(Faculty.class,1);
		System.out.println(f.getFid()+" "+f.getFname()+": "+f.getFsubList().get(0).getSubname()+" & "
														   +f.getFsubList().get(1).getSubname());
		
		
		
	}
}

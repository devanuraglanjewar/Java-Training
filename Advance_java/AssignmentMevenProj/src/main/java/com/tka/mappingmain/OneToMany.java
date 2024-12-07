package com.tka.mappingmain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entityclasses.Department1;
import com.tka.entityclasses.Employee1;

public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Department1.class);
		cfg.addAnnotatedClass(Employee1.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Department1 d1 = new Department1();
//		d1.setDname("IT");
//		d1.setLoc("Pune");
//		
//		Department1 d2 = new Department1();
//		d2.setDname("Support");
//		d2.setLoc("Mumbai");
//		
//		Employee1 e1 = new Employee1();
//		e1.setEmpid(101);
//		e1.setName("Anurag");
//		
//		
//		Employee1 e2 = new Employee1();
//		e2.setEmpid(102);
//		e2.setName("Rohan");
//		
//		
//		Employee1 e3 = new Employee1();
//		e3.setEmpid(103);
//		e3.setName("Soham");
//		
//		Employee1 e4 = new Employee1();
//		e4.setEmpid(104);
//		e4.setName("Sarthak");
//		
//		Employee1 e5 = new Employee1();
//		e5.setEmpid(105);
//		e5.setName("Anuj");
//		
//		ArrayList<Employee1> empList = new ArrayList <Employee1>();
//		empList.add(e1);
//		empList.add(e2);
//		empList.add(e3);
//		
//		ArrayList<Employee1> empListd2 = new ArrayList <Employee1>();
//		empListd2.add(e3);
//		empListd2.add(e4);
//		
//		
//		d1.setEmpList(empList);
//		session.save(d1);
//		
//		d2.setEmpList(empListd2);
//		session.save(d2);
//		Transaction tx = session.beginTransaction();
//		tx.commit();
//		
		
		
//		Fetching data by using HQL
		Query query = session.createQuery("from Department1");
		List<Department1> d = query.list();
		for(Department1 d1:d) {
			System.out.println(d1.getDid()+" "+d1.getDname()+" "+d1.getLoc()+" "+
								d1.getEmpList().get(0).getName()+" ");
		}
		
		Query query1 = session.createQuery("from Employee1 where did = 2");
		List<Employee1> e = query1.list();
		for(Employee1 e1:e) {
			System.out.println(e1.getEmpid()+" "+e1.getName());
		}
		session.close();
		
		
		
		
	}
}

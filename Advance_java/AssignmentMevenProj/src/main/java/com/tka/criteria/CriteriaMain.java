package com.tka.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.tka.entityclasses.Employee;

public class CriteriaMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		
		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);

		System.out.println();
		System.out.println("Between 30000 to 70000");
		c.add(Restrictions.between("salary",30000,70000));
		
		
		List<Employee> result = c.list();
		
		for (Employee e : result ) {
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeptname()+" "+e.getSalary());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Strt With P");
		c.add(Restrictions.like("ename", "j%"));
		List<Employee> result1 = c.list();
		
		for (Employee e : result1 ) {
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeptname()+" "+e.getSalary());
		}
		
		System.out.println();
		System.out.println();
		System.out.println("whose department name is HR Finance and IT");
		c.add(Restrictions.or(
			    Restrictions.eq("deptname", "Sales"),
			    Restrictions.eq("deptname", "Marketing"),
			    Restrictions.eq("deptname", "IT")
			));
		
		List<Employee> result2 = c.list();
		
		for (Employee e : result2 ) {
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeptname()+" "+e.getSalary());
		}
		
		
	}

}

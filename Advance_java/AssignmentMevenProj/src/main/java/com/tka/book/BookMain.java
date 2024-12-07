package com.tka.book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entityclasses.Book;

public class BookMain {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Book b1 = new Book();
		b1.setBid(1);
		b1.setBname("GOT");
		b1.setAuthor("George");
		b1.setPrice(1000);
		b1.setQty(500);
		
		
		Book b2 = new Book();
		b2.setBid(2);
		b2.setBname("Alibaba Chalis Chor");
		b2.setAuthor("Alibaba");
		b2.setPrice(500);
		b2.setQty(1000);
		
		Book b3 = new Book();
		b3.setBid(3);
		b3.setBname("Wings Of Fire");
		b3.setAuthor("A.P.J Abdul kalam");
		b3.setPrice(800);
		b3.setQty(700);
		
		Book b4 = new Book();
		b4.setBid(4);
		b4.setBname("Java By Kiran");
		b4.setAuthor("Kiran");
		b4.setPrice(40);
		b4.setQty(1000);
		
		
		Book b5 = new Book();
		b5.setBid(5);
		b5.setBname("Bhagwat gita");
		b5.setAuthor("Walmiki");
		b5.setPrice(2500);
		b5.setQty(500);
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		session.save(b5);
	Transaction tx = session.beginTransaction();
	tx.commit();
		
		
	}
}

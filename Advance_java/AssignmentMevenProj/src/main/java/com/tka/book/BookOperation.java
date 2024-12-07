package com.tka.book;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entityclasses.Book;

public class BookOperation {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query = session.createQuery("from Book");
		
		
		List<Book> p = query.list();
		for(Book a : p) {
			System.out.println();
			System.out.println(a.getBid()+" book name: "+a.getBname()+", \nAuthor name: "+a.getAuthor()+", \nPrice: "+a.getPrice()+", \nQty: "+a.getQty());
		}
		
//		Search book by author
		Query query1 = session.createQuery("from Book where author =: at");
		query1.setParameter("at", "Alibaba");
		List<Book> a1 = query1.list();
		for(Book a:a1) {
			System.out.println();
			System.out.println("Search book by author");
			System.out.println(a.getBid()+" book name: "+a.getBname()+", \nAuthor name: "+a.getAuthor()+", \nPrice: "+a.getPrice()+", \nQty: "+a.getQty());
		}
		
//		Count how many book by author = "xyz"
		System.out.println();
		System.out.println();
		Query query2 = session.createQuery("SELECT COUNT(*) FROM Book WHERE author = :author");
		query2.setParameter("author", "George");
		Long count = (Long) query2.getSingleResult();

		System.out.println("Number of books by George: " + count);
		
//		As per the quantity print total price of all books 
		Query query3 = session.createQuery("select sum(qty * price) from Book");
		Long totalprice = (Long) query3.getSingleResult();

		System.out.println("Total price of all books: " + totalprice);
		
		
//		delete book by name
//		String bookName = "Java By Kiran"; 
//		Query query4 = session.createQuery("delete from Book where bname = :bookName");
//		query4.setParameter("bookName", bookName);
//		int deletedRows = query.executeUpdate();
//
//		System.out.println("Number of deleted rows: " + deletedRows);

		
//		update book by author using hql 
		
//		String authorName = "George";
//		int newPrice = 19;

//		Query query5 = session.createQuery("update Book set price = :newPrice where author = :authorName");
//		query5.setParameter("newPrice", newPrice);
//		query5.setParameter("authorName", authorName);
//		int updatedRows = query5.executeUpdate();
//
//		System.out.println("Number of updated rows: " + updatedRows);
	}
}

package com.tka.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Qualifier("emp1")
	@Autowired
	Employee e;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		e.setEid(1);
//		e.setEname("Anurag");
//		e.setEdept("Developer");
//		System.out.println();
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEdept());
	}
	
	
	
}

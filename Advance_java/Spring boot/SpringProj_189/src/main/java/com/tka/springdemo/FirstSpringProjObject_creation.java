package com.tka.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.Test;

@ComponentScan("com") // it use to scan all the component which is include under the com (specified) package
@SpringBootApplication
public class FirstSpringProjObject_creation implements CommandLineRunner {

//	@Autowired
//	@Qualifier("emp2")
//	Employee e;
//
//	@Autowired
//	@Qualifier("emp3")
//	Employee e1;
//
//	@Autowired
//	@Qualifier("emp1")
//	Employee e2;

	@Autowired
	Test t1;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringProjObject_creation.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("Emp2: "+e.getEid()+" "+e.getEname());
//		System.out.println("Emp3: "+e1.getEid()+" "+e1.getEname());
//		System.out.println("Emp1: "+e2.getEid()+" "+e2.getEname());
		
		t1.setId(2);
		t1.setName("Omika");
		System.out.println(t1.getId()+" "+t1.getName());
		
	}


	
}

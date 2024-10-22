package com.tka.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean ("emp1")
	public Employee getBean1() {
		
		return new Employee(1,"Anurag",22);
	}
	
	@Bean("emp2")
	public Employee getBean2() {
		
		return new Employee(2,"Om",22);
	}
	
	@Bean("emp3")
	public Employee getBean3() {
		
		return new Employee(3,"Pratik",21);
	}
	
}

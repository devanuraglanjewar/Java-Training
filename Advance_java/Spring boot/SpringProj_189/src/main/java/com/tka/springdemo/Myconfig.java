package com.tka.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
	
	@Bean("emp1")
	public Employee getBeen1() {
		return new Employee(101,"John",10);
	}
	
	@Bean("emp2")
	public Employee getBeen2() {
		return new Employee(102,"Harry",15);
	}
	
	@Bean("emp3")
	public Employee getBeen3() {
		return new Employee(103,"Scott",50);
	}
}

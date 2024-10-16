package com.jbk.day16Collection;

import java.util.ArrayList;

import java.util.Collections;

public class Mn {
	public static void main(String[] args) {
		ArrayList<Employee1> emplist = new ArrayList<Employee1>();
		emplist.add(new Employee1(101,"aniket", "IT", "Developer",200000));
		emplist.add(new Employee1(136,"ankush", "IT", "Tester",100000));
		emplist.add(new Employee1(156,"anant", "IT", "Devops",150000));
		
		Collections.sort(emplist);
		emplist.stream().forEach(s-> System.out.println(s));
		
		System.out.println("------------------");
		
		Collections.sort(emplist, new Employee1comparator());
		emplist.stream().forEach(s-> System.out.println(s));
		
	}
}

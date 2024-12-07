package com.jbk.day16Collection;

import java.util.Comparator;

public class Employee1comparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}
	
}

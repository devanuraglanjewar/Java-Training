package com.jbk.day30streamapi;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Integer> i  = new ArrayList<>(); 
		i.add(25);
		i.add(36);
		i.add(56);
		i.add(96);
		
		int j = i.stream().filter(x->x<50).reduce(0,(a,b)->a+b, Integer::sum);
		System.out.println("Addition of all element: "+ j);
	}

}

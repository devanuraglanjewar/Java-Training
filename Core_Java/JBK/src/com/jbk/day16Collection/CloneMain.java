package com.jbk.day16Collection;

public class CloneMain {
	public static void main(String[] args) {
		Clone c1 = new Clone(101,"anurag");
		Clone c2 = (Clone) c1.clone();
		c2.id = 102;
		c2.name = "Shravani";
	}
	
	
	
}

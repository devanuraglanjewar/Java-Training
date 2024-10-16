package com.jbk.practice.logical.day16;

public class Countspaces {
	public static void main(String[] args) {
		String str = "i am learning at the kiran academy";
		int spacec = 0;
		for(int i = 1; i<str.length();i++) {
			
			if (str.charAt(i) == ' ') {
				spacec++;
			}
		}
		System.out.println(spacec);
	}

}

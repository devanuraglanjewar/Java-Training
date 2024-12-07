//9.	How do you remove leading and trailing spaces from a string in Java?
package com.Ip.Day2;

public class Trim {
	public void modify(String s) {
		String a=s.trim();
		System.out.println(a);
	}
	public static void main(String[] args) {
		Trim g = new Trim();
		g.modify(" Tera jigari ");
	}

}

//8.	How do you remove spaces from a string in Java?
package com.Ip.Day2;

public class RemoveSpece {
	public String remove (String s) {
		String str = s.replaceAll(" ","");
		return str;
		
	}
	public static void main(String[] args) {
		RemoveSpece a = new RemoveSpece();
		String g = a.remove("Anurag and Shravani are Bestfriends");
		System.out.println(g);
	}
}

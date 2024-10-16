//3.	Write a Java program to check if a vowel is present in a string.
package com.Ip.Day_1;

public class CheckVowel {
	public static void main(String[] args) {
		String str = new String ("Hi Its me your partner");
		boolean check = false;
		for(int i =0; i<str.length();i++) {
			char ch = str.charAt(i);
			if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u')) {
				System.out.println("the string contain vowel: "+ str.charAt(i)+" at position "+i);
				check = true;
			}
			
		}
		System.out.println();
		if(check) {
			System.out.println("Yes................The string contain vowel");
		}
		else {
			System.out.println("The string does not contain a vowel.");
		}
	}
}

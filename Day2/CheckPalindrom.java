//1.	How do you check whether a string is a palindrome in Java?
package com.Ip.Day2;

import java.util.Scanner;

public class CheckPalindrom {
	public void check(String s) {
		int len = s.length() - 1;
		int lef = 0;
		int flag = 1;
		
		
		while(lef<len) {
			if (s.toLowerCase().charAt(lef) != s.toLowerCase().charAt(len)) {
				flag = 0;
				break;
			}
			lef++;
			len--;	
		}
		
		
		if (flag == 1) {
			System.out.println("its a palindrom string");
		} else {
			System.out.println("its not a palindrom");
		}
	}
	

	public static void main(String[] args) {
		CheckPalindrom cp = new CheckPalindrom();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		cp.check(s);

	}

}

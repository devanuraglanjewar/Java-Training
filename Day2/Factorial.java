package com.Ip.Day2;

import java.util.Scanner;

public class Factorial {
	 int find (int n){    
		  if (n == 0)    
			  return 1;   
		  else {
			  return (n * find(n-1));  
		  }
		 }
	 
	 public static void main(String[] args) {
		int n,fact = 1;
		Factorial f = new Factorial();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial");
		n=s.nextInt();
		
		if(n<0) {
			System.out.println("you entered negative number.");
		}
		else {
		fact = f.find(n);
		System.out.println(fact);
		}
	}

}
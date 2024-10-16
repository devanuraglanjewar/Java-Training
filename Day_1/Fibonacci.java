//5.	Write a Java program to print a Fibonacci sequence using recursion.
package com.Ip.Day_1;

public class Fibonacci {

	public void generate() {

		int a = 0;
		int b = 1;

		for (int i = 0; i < 10; i++) {
			int p = a + b;

			System.out.println(a + " + " + b + " = " + p);
			

			a = b;
			b = p;
		}
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.generate();
	}
}

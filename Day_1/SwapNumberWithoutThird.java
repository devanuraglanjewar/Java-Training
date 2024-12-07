//2.	How do you swap two numbers without using a third variable in Java?
package com.Ip.Day_1;

public class SwapNumberWithoutThird {
	public void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a:" + a + " b:" + b);
	}

	public static void main(String[] args) {
		SwapNumberWithoutThird a = new SwapNumberWithoutThird();
		a.swap(5, 7);
	}
}
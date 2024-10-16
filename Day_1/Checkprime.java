package com.Ip.Day_1;

public class Checkprime {
	public void check(int a) {
		int flag = 0;
		int m = a / 2;
		if (a == 0 || a == 1) {
			System.out.println("It's a non prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (a % i == 0) {
					System.out.println(a + " is not prime number");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println(a + " is prime number");
		}
	}
	

	public static void main(String[] args) {
		Checkprime cp = new Checkprime();
		cp.check(5);
		cp.check(4);
		cp.check(12);
	}
}
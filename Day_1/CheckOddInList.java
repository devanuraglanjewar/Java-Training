//6.	How do you check if a list of integers contains only odd numbers in Java?
package com.Ip.Day_1;

public class CheckOddInList { 
	public void check(int a) {
		if(a<0) {
			System.out.println(a+" a negative integer ☠️");
		}else {
			if(a%2 != 0) {
				System.out.println(a+ " is a Odd number ✔️");
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,-9,5,8,9,23,74,84,65};
		
		CheckOddInList c = new CheckOddInList();
		
		for(int i = 0; i<arr.length;i++) {
			c.check(arr[i]);
		}
	}
}

//find the sum of all even number in the array
package com.jbk.day8arrays;
public class Program6 {
	public static void main(String[] args) {
		int a [] = {2,3,9,4,6,5,8,7,4,2,6};
		int sum =0;
	    
		for(int i = 0; i<a.length; i++) {
	    	if(a[i]%2 ==0) {
	    		sum = sum+a[i];
	    	}
	    }System.out.println(sum);
	}
}


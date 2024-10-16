//1.	How do you reverse a string in Java?
package com.Ip.Day_1;

public class StringReverser {
	
	public static String reverse(String s) {

		// Finding the index of the whitespaces
	    int x = s.indexOf(" ");
	    
	    //Base condition
	    if(x == -1)
	      return s;
	      
	     //Recursive call
	    return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
	     }
	
	public static void main(String[] args) {
		
		String originalStr = "Anurag";
		
		String reversedStr = "";
		
		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i)+ reversedStr;
		}
		
		System.out.println("Reversed string: "+ reversedStr);
		
		String str = "I am good";
        String rev = reverse(str);
        System.out.println("Reversed sentence: " + rev);
        
	}	
}

package com.Ip.Day_1;

public class ReverseSce {
	public static void main(String[] args) {
		String str = "Hello it's me";
		String rev = "";
		
		String s[] = str.split(" ");
		
		 for(int j=0;j<s.length;j++){
	            rev = s[j]+" "+rev;
	        }
		 System.out.println(rev);
	}
}

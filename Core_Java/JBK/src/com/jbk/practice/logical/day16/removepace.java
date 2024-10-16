package com.jbk.practice.logical.day16;

public class removepace {
	public static void main(String[] args) {
		String str = "i am learning at the kiran academy";
		StringBuilder sb = new StringBuilder();
			for(int i =0 ; i<str.length();i++) {
			
				if (str.charAt(i) == ' ') {
				
				}
				else {
					sb.append(str.charAt(i));
				}
				
		}
			System.out.println(sb);
	}
}

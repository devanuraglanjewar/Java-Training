// remove words which start from i
package com.jbk.practice.logical.day16;

public class RemovewordsStrtFromi {
	public static void main(String[] args) {
		 String str = "i am learning at the kiran academy";
	        String[] words = str.split(" "); 
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (!word.startsWith("i")){
	                result.append(word).append(" ");
	            }
	        }

	        System.out.println(result.toString().trim());
		
		
	}
}

//sort in asc order
package com.jbk.day9arraysort;

public class Program2 {
	public static void main(String[] args) {
		int a[] = {12,34,55,12,1,4,54};
		for(int i = 0; i<a.length;i++) {
			for(int j = i; j<a.length-1; j++) {
				if(a[i]>a[j+1]) {
					int t = a[i];
					a[i] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		for(int i = 0; i<a.length;++i) {
			System.out.print(a[i]+" ");
		}

	}
}

package com.java.learning;

public class pattern {
	public static void main(String args[]) {
		int n =5;
		System.out.println("*");
		
		for(int i=2;i<=n-1;i++) {
			System.out.print("*");
			for(int j=1;j<=(i-2);j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			System.out.print("*");
		}
	}

}

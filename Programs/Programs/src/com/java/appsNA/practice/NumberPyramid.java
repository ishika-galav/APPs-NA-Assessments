package com.java.appsNA.practice;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		for(int i=1; i<=n; i++) {
			for(int j =n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}

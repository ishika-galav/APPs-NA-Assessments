package com.java.appsNA.practice;

public class CharacterPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		char ch = 'A';
		
		for(int i=1; i<=n; i++) {
			for(int j =n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}

}

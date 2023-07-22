package com.java.interview;

import java.util.Scanner;

public class Prog57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ishika";
		
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		
		for(int i=0; i<str.length(); i++) {
			if(i==idx) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
		

	}

}

package com.java.interview;

import java.util.HashMap;
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Issshika";
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}

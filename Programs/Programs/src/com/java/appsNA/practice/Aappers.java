package com.java.appsNA.practice;

public class Aappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ishikaaa";
		
		char ch = 'a';
		int count=0;
		
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);

	}

}

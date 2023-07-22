package com.java.appsNA.practice;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "program";
		
		String rev = "";
		char ch;
		
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		
		System.out.println(rev);

	}

}

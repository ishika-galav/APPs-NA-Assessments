package com.java.interview;

public class Vipin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MADAM";
		String rev = "";
		char ch;
		
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not");
		}

	}

}

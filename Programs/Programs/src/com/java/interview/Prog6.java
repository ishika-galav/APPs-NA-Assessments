package com.java.interview;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		
		String rev ="";
		char ch;
		
		for(int i =0; i<str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		
		if(str.equals(rev)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}

	}

}

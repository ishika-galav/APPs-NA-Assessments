package com.java.learning;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "civic";
		String rev = "";
		
		for(int i= str.length()-1; i>=0; i-- ) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}

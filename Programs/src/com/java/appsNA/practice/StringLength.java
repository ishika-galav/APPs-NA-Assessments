package com.java.appsNA.practice;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "capgemini";
		 char[] ch = str.toCharArray();
		 
		 int count = 0;
		 
		 for(char c : ch) {
			 count++;
		 }
		 
		 System.out.println(count);

	}

}

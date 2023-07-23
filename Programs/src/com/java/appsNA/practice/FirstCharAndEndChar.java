package com.java.appsNA.practice;

public class FirstCharAndEndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ishikais";
		String s1 = "", s2 = "";
		
		s1 = str.substring(0,2);
		s2 = str.substring(str.length()-2, str.length());
		
		if(s1.equalsIgnoreCase(s1)) {
			System.out.println("Charcters present");
		}
		else
			System.out.println("Characters not present");

	}

}

package com.java.interview;

public class Vipin3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "eLePHant";
		String str2 = "";
		char ch;
		
		
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				str2 += Character.toLowerCase(ch);
			}
			if(Character.isLowerCase(ch)) {
				str2 += Character.toUpperCase(ch);
			}
		}
		
		System.out.println(str2);

	}

}

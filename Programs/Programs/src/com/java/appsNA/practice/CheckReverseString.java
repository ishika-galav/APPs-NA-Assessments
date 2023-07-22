package com.java.appsNA.practice;

import java.util.*;

public class CheckReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ishika";
		String str2 = "akihsi";
		
		String rev = "";
		
		for(int i=str1.length()-1; i>=0; i--) {
			char ch = str1.charAt(i);
			rev += ch;
		}
		
		System.out.println(rev);
		
		if(rev.equals(str2)) {
			System.out.println("Strings are equal");
		}
		
		else {
			System.out.println("Strings are not equal");
		}
		
		

	}

}

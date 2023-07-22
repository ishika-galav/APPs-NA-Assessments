package com.java.appsNA.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "yass";
		String str2 = "ssay";
		
		if(str1.length()!= str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean flag = Arrays.equals(arr1, arr2);
	    System.out.println(flag);

	}

}

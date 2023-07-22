package com.java.learning;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String s1 = "yass";
		String s2 = "ssay";
		
		if(s1.length()!= s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		//.toCharArray();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		//System.out.println(arr1);
	    Arrays.sort(arr2);
	    //System.out.println(arr2);
		
	    //if(arr1.equals(arr2))System.out.println("Anagram");
	    boolean flag = Arrays.equals(arr1, arr2);
	    System.out.println(flag);
	}

}

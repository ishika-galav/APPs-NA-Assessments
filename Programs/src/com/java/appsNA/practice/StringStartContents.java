package com.java.appsNA.practice;

public class StringStartContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Good Morning";
		String str2 = "Good Night";
		
		String arr[] = str1.split(" ");
		
		if(str1.startsWith(arr[0])) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}

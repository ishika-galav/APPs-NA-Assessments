package com.java.appsNA.practice;

import java.util.Arrays;

public class DigitOrderWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num = 28156437;
		String str = Long.toString(num);
		
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		System.out.println(arr);
	}

}

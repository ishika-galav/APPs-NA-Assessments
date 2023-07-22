package com.java.appsNA.practice;

public class NumberInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 56378901;
		int count = 0;
		
		while(num != 0) {
			num /= 10;
			count++;
			
		}
		
		System.out.println(count);

	}

}

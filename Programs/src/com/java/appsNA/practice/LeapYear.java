package com.java.appsNA.practice;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 1996;
		
		
		if (year % 4 == 0 || year % 100 == 0 && year % 400 ==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}

	}

}

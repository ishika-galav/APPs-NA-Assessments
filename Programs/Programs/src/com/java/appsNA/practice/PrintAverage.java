package com.java.appsNA.practice;

import java.util.Scanner;

public class PrintAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0;i<10; i++) {
			arr[i] = sc.nextInt();	
		}
		
		int sum =0;
		
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		float avg = sum/arr.length;
		
		System.out.println(avg);

	}

}

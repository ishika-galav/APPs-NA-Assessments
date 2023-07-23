package com.java.appsNA.practice;

public class EvenAndOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8,7,6,5,3,1,3,2};
		
		int even = 0, odd=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				even += arr[i];
			}
			else
				odd += arr[i]; 
		}
		
		System.out.println("Even sum: " +even + " Odd sum: " + odd);

	}

}

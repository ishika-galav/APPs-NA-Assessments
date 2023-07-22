package com.java.appsNA.practice;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,8,1,90,66,5};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> largest) {
				largest = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest is: " + largest);
		System.out.println("Smallest is: " + smallest);

	}

}

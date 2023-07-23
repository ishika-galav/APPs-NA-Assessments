package com.java.appsNA.practice;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,77,81,55,90};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest: " + largest + " Smallest: " + smallest);

	}

}

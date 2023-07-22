package com.java.appsNA.practice;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,9,3,7};
		
		System.out.println("Even no.s : ");
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd no.s : ");
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}

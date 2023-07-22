package com.java.appsNA.practice;

public class ArraysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,1,6,4,5,9,7};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int ar : arr) {
			System.out.println(ar);
		}

	}

}

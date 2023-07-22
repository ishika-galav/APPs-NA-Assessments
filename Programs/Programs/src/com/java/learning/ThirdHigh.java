package com.java.learning;

public class ThirdHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,6,7,1,5};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
		}
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

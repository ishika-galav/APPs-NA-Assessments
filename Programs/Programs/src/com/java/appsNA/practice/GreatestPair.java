package com.java.appsNA.practice;

public class GreatestPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,1,44,8,12};
		int max = 0; 
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println(max);

	}

}

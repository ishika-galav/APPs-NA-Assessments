package com.java.appsNA.practice;

public class PairsEqualToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,8};
		int n = 9; 
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == n) {
					System.out.println(arr[i] + " " + arr[j]);
					break;
				}
			}
		}

	}

}

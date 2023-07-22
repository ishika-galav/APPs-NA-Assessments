package com.java.appsNA.practice;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[]= {3,7,1,9,5,4};
		
		Arrays.sort(arr);
		int len = arr.length;
		System.out.println(arr[len-2]);

	}

}

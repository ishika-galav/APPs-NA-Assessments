package com.java.interview;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[] = {2,3,5,6,3,3,3,2,3,5,0};
		
		int size = arr.length;
		
		Arrays.sort(arr);
		
		for(int i = size-2; i>=0; i--) {
			if(arr[i]!= arr[size-1]) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		

	}

}

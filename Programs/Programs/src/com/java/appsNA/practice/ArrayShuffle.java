package com.java.appsNA.practice;

import java.util.Random;

public class ArrayShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,7,9,4,6};
		
		Random rnd = new Random();
		
		for(int i= arr.length-1; i>0; i--) {
			int j = rnd.nextInt(i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int b : arr) {
			System.out.println(b);
		}

	}

}

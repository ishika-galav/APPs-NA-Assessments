package com.java.learning;
import java.util.*;


public class MinAndMaxArr {
	
	public int max(int arr[]) {
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)max=arr[i];
		}
		return max;
	}
	
	public int min(int arr[]) {
		int min= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) min=arr[i];
		}
		return min;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		MinAndMaxArr m = new MinAndMaxArr();
		
		System.out.println(m.max(arr));
		System.out.println(m.min(arr));

	}

}

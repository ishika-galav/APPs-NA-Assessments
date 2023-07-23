package com.java.appsNA.practice;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,4,6,8};
		int arr2[] = {1,3,5,7};
		
		int mergedArray[] = new int [arr1.length + arr2.length];
		
		for(int i=0; i<arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			mergedArray[arr1.length+i] = arr2[i];
		}
		
		System.out.println(Arrays.toString(mergedArray));

	}

}

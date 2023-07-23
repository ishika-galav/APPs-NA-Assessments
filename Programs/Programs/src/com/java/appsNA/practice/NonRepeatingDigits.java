package com.java.appsNA.practice;

public class NonRepeatingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,5,7,8,3,5,1,2,4,6,1};
		
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
			for(int j=0; j<arr.length; j++) {
				if(i!=j && arr[i]== arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(arr[i] + " ");
			}
		}
		

	}

}

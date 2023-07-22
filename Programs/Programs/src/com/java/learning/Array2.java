package com.java.learning;
import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean isAscending = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1])isAscending = false;
		}
		
		if(isAscending)System.out.println("ascending");
		
		else {
			System.out.println("Descending");
		}

	}

}

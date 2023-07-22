package com.java.learning;
import java.util.*;
public class Loop {
	public static void main(String args[]) {
		int arr[]= {2,5,9};
		
		//Scanner sc= new Scanner(System.in);
		//for(int i=0; i<arr.length;i++ ) {
			//arr[i]=sc.nextInt();
		//}
		for(int x: arr) {
			System.out.println(x);
		}
	}
}

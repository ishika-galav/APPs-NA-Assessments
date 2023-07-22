package com.java.learning;
import java.util.*;

public class Arrayrev {
	public static void main(String args[]) {
		int arr[] = {2,3,4,5,6};
		int n = 0;
		int temparr[]= new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			temparr[n]= arr[i];
			n++;
		}
		for(int a: temparr) {
			System.out.println(a);
		}
	}

}
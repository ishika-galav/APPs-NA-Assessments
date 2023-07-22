package com.java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = Arrays.asList(2,4,0,1,56,23,4);
//		arr[2]=67;
//		lst.add(2,67);
		
		int temp =0;
		int n = lst.size();
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<(n-i); j++) {
				if(lst.get(j)> lst.get(j+1)) {
					temp = lst.get(j);
					lst.add(j,lst.get(j+1));
					lst.add(j+1,lst.get(temp));
					
				}
			}
		}
		
		for(int i=0; i<n ;i++) {
			System.out.println(lst.get(i)+" ");
		}

	}

}

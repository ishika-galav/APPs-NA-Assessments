package com.java.interview;

import java.util.ArrayList;

public class Prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst = new ArrayList<>();
		
		
		int n = 100;
		
		for(int i=2; i<=n; i++) {
			boolean flag = true;
			for(int j =2; j<=i/2; j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lst.add(i);
			}
		}
		System.out.println(lst);
		
		

	}

}

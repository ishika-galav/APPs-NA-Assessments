package com.java.interview;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean flag = true;
		
		int n = num/2;
		
		for(int i=2; i<=n; i++) {
			if(num%i ==0) {
				flag = false;
				break;
				
			}
		}
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}

package com.java.interview;

import java.util.Scanner;

public class Prog27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int r, res=0; 
		
		while(num>0) {
			r = num%10;
			res= (res*10) + r;
			num = num/10;
		}
		
		System.out.println(res);
		

	}

}

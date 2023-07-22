package com.java.appsNA.practice;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();
		
		int res = 1;
		
		for(int i = power; i>0; i--) {
			res *= num;
		}
		
		System.out.println(res);

	}

}

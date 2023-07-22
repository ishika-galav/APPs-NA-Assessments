package com.java.interview;

import java.util.Scanner;

public class Prog22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r, sum=0,temp;
		
		temp=num;
		
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
			
		}
		if(sum==temp) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");

	}

}

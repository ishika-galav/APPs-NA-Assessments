package com.java.interview;

import java.util.Scanner;

public class Prog8 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag =0;
		
		int m = num/2;
		for(int i=2; i<=m; i++) {
			if(num%i==2) {
				System.out.println("Not Prime");
				flag =1;
				break;
				
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
	}

}

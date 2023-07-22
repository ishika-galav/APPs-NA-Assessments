package com.java.learning;
import java.util.*;

public class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		int sum=0;
		int ld;
		while(temp>0) {
			temp /= 10;
			count++;
		}
		temp=num;
		while(temp>0) {
			
			ld = temp % 10;
			
			sum += (Math.pow(ld, count));
			
			temp /= 10;
		}
		
		if(num==sum) {
			System.out.println("Armstrong");
		}
		else System.out.println("Not");
	
	}

}

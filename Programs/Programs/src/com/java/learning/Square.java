package com.java.learning;
import java.util.*;

public class Square {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int result = 1;
//		for(int i=1; i<=y; i++) {
//			result = x*i;
//		}
//		System.out.println(result);
		
//		int x = sc.nextInt();
//		boolean check = true;
//		
//		for(int i=2; i*i<=x; i++) {
//			if( x%i==0) {
//				check = false;
//				break;
//			}
//		
//		}
//		if(x<2) check=true;
//		System.out.println(check);
		
//		for(int i=0;i<=20;i++) {
//			if(i==12) continue;
//			System.out.println(i);
		
//		}

//		int i=0;
//		while(i<=20) {
//			System.out.println(i);
//			i++;
//		}
//		
//		String grade = sc.nextLine();
//		switch(grade) {
//		case "A":
//		case "a":
//			System.out.println("Very good");
//			break;
//			
//		case "B":
//			System.out.println("Good");
//			break;
//			
//			
//		case "C":
//			System.out.println("Can you Better");
//			break;
//			
//			
//		default: 
//			System.out.println("Invalid Input");
//		}
		
		int x= sc.nextInt();
		int temp = x;
		int sum=0;
		while(temp>0) {
			int ld = temp%10;
			sum = sum*10+ld;
			temp/=10;
		}
		if(x==sum) System.out.println("Palindrome");
		else System.out.println("Not");
		
	}

}

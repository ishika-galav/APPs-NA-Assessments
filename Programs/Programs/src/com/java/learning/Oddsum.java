package com.java.learning;
import java.util.*;

public class Oddsum {
	
	public int Sum(int n) {
		int sum = 0;
		for(int i=1; i<n; i++) {
			if(i%2!=0) {
				sum += i;
			}
		}
		return sum;
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Oddsum odd = new Oddsum();
		
		System.out.println(odd.Sum(n));
		

	}

}

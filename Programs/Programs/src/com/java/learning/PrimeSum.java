package com.java.learning;
import java.util.*;

public class PrimeSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int n=100;
		int sum=1;
		
		while(n>=2) {
			boolean check=true;
			for(int i=2;i*i<=n;i++) {
				
				if(n%i==0) {
					check=false;
					break;
				}
				
			}
			if(check) {
				//System.out.println(n);
				sum+=n;
			}
			n--;
		}
		System.out.println(sum);
	}
}


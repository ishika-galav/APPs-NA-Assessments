package com.java.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,632,5,2,3,5,6};
		
		Arrays.stream(arr).filter(PrimeSquare:: isPrime).mapToLong(n ->(long)n*n).forEach(n->System.out.println(n));
		
		
		
	}	
		public static boolean isPrime(int num) {
			if(num<=1) {
				return false;
			}
			
			for(int i=2; i<= Math.sqrt(i); i++) {
				if (num % i == 0) {
	                return false;
	            }
			}
			return true;
		}
}
		
		
		
		
		
		
		

//        for(int i=0;i<arr.length;i++) {
//            boolean isPrime=true;
//            for(int j=2;j*j<=arr[i];j++) {
//                if(arr[i]%j==0) {
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime) {
//                System.out.println(arr[i]*arr[i]);
//            }
//        }
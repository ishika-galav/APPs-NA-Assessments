package com.java.interview;

import java.util.Scanner;

public class MagicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Magic no. is the no. whose sum and it's resultant sum is equal to 1
	// i.e. 325  3+2+5 =10, 1+0 = 1 Hence its a magic no.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if((num-1)%9==0) System.out.println("Magic no.");
		else System.out.println("Not Magic no."); 

	}

}

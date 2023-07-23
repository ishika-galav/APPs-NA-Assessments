package com.java.appsNA.practice;

public class Pattern53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =4;

        for(int i=1;i<=n;i++) {

            for(int j=i;j<=n-1;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}

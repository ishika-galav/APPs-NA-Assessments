package com.java.appsNA.practice;

public class Pattern54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =4;

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            if(i==1 || i==n) {
                for(int k=1;k<=i*2-1;k++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j=1;j<=i*2-1;j++) {
                    if(j==1 || j==i*2-1) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

	}

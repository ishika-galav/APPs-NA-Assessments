package com.java.learning;
import java.util.*;

public class Str1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		
//		System.out.println(str.replace(" ", "_"));
//		
		
		String var = "Saurabh";

//This is enhanced switch.
		
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");

	}

}

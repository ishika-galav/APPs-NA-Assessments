package com.java.interview;

import java.util.stream.Stream;

public class Prog17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of("Hey this is ishika").map(n-> n.split(" ").length).forEach(System.out :: print);
		
		
		//Without Stream
		String str = "Hello, world is very cruel";
		String[] arr = str.split(" ");
		System.out.println("\n" + arr.length);
		
		

	}

}

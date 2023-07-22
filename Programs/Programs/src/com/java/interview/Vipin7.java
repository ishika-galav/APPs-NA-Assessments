package com.java.interview;

import java.util.stream.Stream;

public class Vipin7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "My name is ishika";
		
		Stream.of("My name is ishika").map(n-> n.split(" ").length).forEach(System.out::print);
		
		

	}

}

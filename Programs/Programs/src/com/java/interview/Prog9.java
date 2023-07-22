package com.java.interview;

import java.util.Arrays;
import java.util.List;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> str = Arrays.asList("Capgemini","Accenture","TCS","EPAM");
		
		str.stream().sorted().forEach(n-> System.out.println(n));

	}

}


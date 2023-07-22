package com.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class productMain {

	public static void main(String[] args) {
		Product pd1 = new Product(1, "ZApple");
		Product pd2 = new Product(2, "Cake");
		Product pd3 = new Product(3, "Milk");
		Product pd4 = new Product(4, "Banana");
		
		List<Product> list = new ArrayList<>();
		
		list.add(pd1);
		list.add(pd2);
		list.add(pd3);
		list.add(pd4);
		
		
		List<Product> result = list.stream().sorted((obj1,obj2)->obj1.getProductName().compareTo(obj2.getProductName())).collect(Collectors.toList());
		for (Product product : result) {
			System.out.println(product);
		}
		
		System.out.println("\n");
		
		List<Product> res = list.stream().sorted((o1,o2)->o2.getProductName().compareTo(o1.getProductName())).collect(Collectors.toList());
		for (Product product : res) {
			System.out.println(product);
		}
	}

}

package com.java.mock;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(1, "SoyaMilk");
		Product p2 = new Product(2, "Eggs");
		Product p3 = new Product(3, "Bread");
		Product p4 = new Product(4, "Sugar");
		Product p5 = new Product(5, "Mayo");
		
		List<Product> lst = new ArrayList<>();
		
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		lst.add(p4);
		lst.add(p5);
		
		Collections.sort(lst);
		
		lst.forEach(System.out::println);
	
		List<Product> pdl = lst.stream().filter(p -> p.getName().toLowerCase().startsWith("s")).collect(Collectors.toList());
		
		System.out.println(pdl);
	}

}

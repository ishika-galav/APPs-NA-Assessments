package com.java.assigmnent;

import java.util.ArrayList;
import java.util.List;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1 = new Mobile(1, "One Plus Nord 3", "Grey", 128);
		Mobile m2 = new Mobile(2, "Redmi Note 10", "Blue", 64);
		
		List<Mobile> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		System.out.println(m1);

	}

}

package com.java.interview;

import java.util.Iterator;
import java.util.TreeSet;

public class Prog36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset = new TreeSet<>();
		tset.add("ishika");
		tset.add("sudeep");
		
		Iterator<String> it = tset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	} 

}

package com.java.oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		Pet p = d;
		
//		d.walk();
//		p.walk();
		
		greetings();
		greetings("Ishika");
		greetings("hey its me", 2);
		
	}
	public static void greetings() {
		System.out.println("Hello");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}
	public static void greetings(String s, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(s);
		}
	}

}

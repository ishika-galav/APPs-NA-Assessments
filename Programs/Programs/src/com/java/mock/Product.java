package com.java.mock;

public class Product implements Comparable<Product> {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Products [productId: "+id+" productName: "+name+"]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}
	
	
	
	
	
	

}

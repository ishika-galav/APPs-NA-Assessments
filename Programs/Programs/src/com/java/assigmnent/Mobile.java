package com.java.assigmnent;

public class Mobile {
	
	private int id;
	private String name;
	private String color;
	private int storage;
	
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
	public Mobile(int id, String name, String color, int storage) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.storage = storage;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mobile [ Id: "+id+" Name: "+name+" Color: "+color+" Storage: " +storage+"]";
	}
	
	
	
	

}

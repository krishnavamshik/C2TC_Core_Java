package com.cg.Di;

public class Student {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("my name is :"+ name);
	}
}

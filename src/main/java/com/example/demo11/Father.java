package com.example.demo11;

public class Father {
	private String name;

	protected int age;

	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void walk() {
		System.out.println(name +" is walking ! ");
	}
}

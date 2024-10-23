package com.example.demo11;

public class Employee2 extends HomeTown {

	private String id;

	private String name;

	private int age;

	private String gendear;

	public Employee2() {
		super();
	}

	public Employee2(String id, String name, int age, String gendear, //
			String city, String state, String country) {
		super(city, state, country);
		this.id = id;
		this.name = name;
		this.age = age;
		this.gendear = gendear;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getGendear() {
		return gendear;
	}

	public void setGendear(String gendear) {
		this.gendear = gendear;
	}

}

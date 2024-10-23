package com.example.demo11;

public class Employee {
	private String id;

	private String name;

	private int age;

	private String gendear;

	// 把自定義的整個 HomeTown 類別當成 employee 的屬性之一
	private HomeTown homeTown;

	public Employee() {
		super();
	}

	public Employee(String id, String name, int age, String gendear, HomeTown homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gendear = gendear;
		this.homeTown = homeTown;
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

	public HomeTown getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(HomeTown homeTown) {
		this.homeTown = homeTown;
	}
	
	

}

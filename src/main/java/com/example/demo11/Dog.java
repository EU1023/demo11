package com.example.demo11;

public class Dog {
	//宣告屬性(特性)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//定義方法(行為)
	public void run() {
		System.out.println("正在跑!");
	}
	
	//方法的多載(overload)
	//方法名稱一樣，但是方法中的參數個數不一樣，呼叫run方法時可以辨別是呼叫無參數的還是有參數的方法
	//1
	public void run(String name) {
		System.out.println("正在跑!");
	}
	//2
	//方法名稱一樣，方法中的參數個數一樣，但是相同位置的參數資料型態不一樣
	public void run(int age,String category) {
		System.out.println("正在跑!");
	}
	//3
	public void run(String category,int age) {
		System.out.println("正在跑!");
	}
	
	public void runing() {
		System.out.println(name+"正在跑!");
	}
	
	public void eat(String name) {
		//印出；霸氣的總柴很愛吃變成胖總柴
		//變數名跟屬性名一樣的話會優先以{}內的變數名，所以需要使用this，或是直接修改變數名不跟屬性名重複
		System.out.println(this.name + "很愛吃變成" + name);	
	}
}

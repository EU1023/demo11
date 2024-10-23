package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		//使用關鍵字 new 建立實例(instance)
		Dog myDog = new Dog();
		//設定每個實例不同的屬性(特性)
		myDog.category = "柴犬";
		myDog.color = "淺黃色";
		myDog.name = "佐田";
		myDog.age = 5;
		
		System.out.println("狗的名字: "+ myDog.name);
		System.out.println();
		//=========================================
		//使用方法(行為)
		myDog.run();
		myDog.runing();
		myDog.eat("胖總柴");
	}
	
	@Test
	public void bankTest() {
		Bank myMani = new Bank();
		myMani.setUser("社畜");
		myMani.setBalance(1000);
		
		//myMani.saving(100);
		myMani.withdraw(10000);
	}
	
	public void stringTest() {
		// 31 是靜態方法，可以直接透過 類別名稱.靜態方法 呼叫
		Bank.withdraw31(null, null, null, 0);
		//  3 是一般方法，必須要先把類別 new 出來後才能呼叫
		String str  ="ABC";
		String str1 ="ABC";
		String str2 = new String("ABC");
		String str3 =str;
		Bank bank = new Bank();
		//bank.withdraw4(1000, "title", "tta", 0);
		//======================================
		Math.random();
		Random ran = new Random();
		ran.nextInt();
	}
	
	@Test
	public void bankTest2(){
		Bank bank = new Bank();
		bank.setBranch("TTA");
		bank.setUser("AAA");
		bank.setBalance(1000);
		//======================
		Bank bank1 = new Bank("ttt","caa",5000);
		System.out.println("=====================");
	}
	
	@Test
	public void strintTest3() {
		String str = "ABCADAQW";
		String newStr = str.replace("A","Z");
		String newStr1 = str.replaceAll("A", "Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z");
		System.out.println(newStr2);
	}
		
}

package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		//�ϥ�����r new �إ߹��(instance)
		Dog myDog = new Dog();
		//�]�w�C�ӹ�Ҥ��P���ݩ�(�S��)
		myDog.category = "���";
		myDog.color = "�L����";
		myDog.name = "����";
		myDog.age = 5;
		
		System.out.println("�����W�r: "+ myDog.name);
		System.out.println();
		//=========================================
		//�ϥΤ�k(�欰)
		myDog.run();
		myDog.runing();
		myDog.eat("�D�`��");
	}
	
	@Test
	public void bankTest() {
		Bank myMani = new Bank();
		myMani.setUser("���b");
		myMani.setBalance(1000);
		
		//myMani.saving(100);
		myMani.withdraw(10000);
	}
	
	public void stringTest() {
		// 31 �O�R�A��k�A�i�H�����z�L ���O�W��.�R�A��k �I�s
		Bank.withdraw31(null, null, null, 0);
		//  3 �O�@���k�A�����n�������O new �X�ӫ�~��I�s
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

package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("AAA");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void animalTest2() {
		Animal ani = new Animal("ggg", 5);
		ani.setName("AAA");
		ani.eat();
	}

	@Test
	public void birdTest() {
		Bird bird = new Bird();
		bird.setName("Bbb");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void birdTest2() {
		Bird bird = new Bird("BIRD", 5);
		bird.eat();
		bird.sleep();
		bird.flying();
		bird.flying2();
	}

	@Test
	public void birdTest3() {
		// ���M���^�Ӫ���ƫ��A�O�����O�A���]�� new �X�Ӫ���ҬO�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("BIRD", 5);
		// eat() �M sleep() ���檺�|�O�b�l���O�����s�w�q����@���e
		bird.eat();
		bird.sleep();
		// �H�U��Ӥ�k�L�k�Q�I�s�A�]���S���Q�w�q�b�����O��( Animal )
//		bird.flying();
//		bird.flying2();
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��Ҩ䱵������ƫ��A�O�����O��
		// 1. �u��I�s�w�q�b�����O������k
		// 2. ��l���O�����s�w�q�����O����k�ɡA���檺�|�O�l���O����@���e
	}

	@Test
	public void birdTest4() {
		Bird bird = new Bird("BIRD", 5);
		// ���檺�O�w�q�b bird ������@���e
		bird.flying();
		// ���s�w�q flying() ����k
		// 1. �b�إ߷s����ҮɡA���������s����@���e�A�Υ[�W�j�A��{}
		// 2. �j�A���n�g�b�������e�A�B�����@�w�n�n����
		// 3. ���s�w�q����@���e�N�Ȧ��b�o������
		// 4. @Override �i���i�L�A����ĳ��
		Bird bird2 = new Bird("BIRD", 5) {

			@Override
			public void flying() {
				System.out.println("��������");
			}
		};
		bird2.flying();
	}

	@Test
	public void faSoDa() {
		Son son = new Son("debi", 18);
		Daughter da = new Daughter("gg", 5);
		son.walk();
		son.playBall();
		da.walk();
		da.shopping();
	}
	
	@Test
	public void DiBoSu() {
		Dive dive = new Submarine();
		Submarine sub = new  Submarine();
		
		dive.Diving();
		sub.move();
		
	}
}

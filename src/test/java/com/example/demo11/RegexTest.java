package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {
	@Test
	public void test0() {
		// \ �b java ����ܸ���Ÿ��A�ΨӸ��榳�S��N�q���Ÿ� --> �����S��N�q���Ÿ��ܦ���ª��r��
		// \ ����Ÿ��L�k��W�s�b
		// \\ --> �Ĥ@�Ӹ���Ÿ����ĤG�Ӹ���Ÿ��q���S��N�q�ܦ���ª��r�� 
		String pattern = "\\";
		System.out.println(pattern);
	}
	@Test
	public void test() {
		//��������X�榡:4-3-3
		// \d ��ܼƦr 0~9�����N�䤤�@��
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		Scanner scan = new Scanner(System.in);
		System.out.print("��J������X(�榡�� 4-3-3) : ");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if (check) { // ���P�� chenk == true
			System.out.println(input+" �ŦX������X�榡�C");
		}
		else {
			System.out.println(input+" ���ŦX������X�榡�C");
		}
		//============================================
		// �W�����ܼ� input.matches(pattern) �����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ� check �u�ϥΤF�@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡�ӧ�g
		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input+" �ŦX������X�榡�C");
		}
		else {
			System.out.println(input+" ���ŦX������X�榡�C");
		}
	}
	@Test
	public void test1() {
		//��������X�榡:4-3-3
		// \d ��ܼƦr 0~9�����N�䤤�@��
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �ϥΤj�A�� {} �B�z pattern �����ƥX�{���r��
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// �W�@�� �]��-\\d{3} ���ƤF2���A��{}�u���w��e�����F��(\\d)�A�L�k�s��ϥΡA�ҥH�ϥΤp�A���N���-\\d{3}�����@��
		String pattern = "\\d{4}(-\\d{3}){2}";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��J������X(�榡�� 4-3-3) : ");
		String input = scan.next();
		
		if (input.matches(pattern)) { // ���P�� input.matches(pattern) == true
			System.out.println(input+" �ŦX������X�榡�C");
		}
		else {
			System.out.println(input+" ���ŦX������X�榡�C");
		}
	}
	@Test
	public void test2() {
		//���ܮ榡1:(xx)-xxxxxxx
		//���ܮ榡2: xx -xxxxxxx
		String pattern1 = "\\d{2}-\\d{7}";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		System.out.print("��J���ܸ��X(2-7):");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if (input.matches(pattern1)||input.matches(pattern2)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
		//=====================================================
		//�X�� pattern1 pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (input.matches(pattern3)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
		//====================================================
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if (input.matches(pattern4)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
	}
	//ch13 27 29
	@Test
	public void testwork27() {
		System.out.print("��J���ܸ��X(2-7):");
		// ���ܮ榡: 2-7~8or(2)7~8
		//xx-or(xx) 7~8
		String pattern = "(\\d{2}-|\\(\\d{2}\\))\\d{7,8}";
		// \\d{7,8} : ��� \\d �ܤ֥X�{7���A�ܦh�X�{8��
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
	}
	@Test
	public void testwork29() {
		//�ϽX�`�@2~4�X 0�}�Y�A���X7~8�X �����H-�s��
		System.out.print("��J���ܸ��X(2-7):");
		
		String pattern = "(0\\d{1,3})-\\d{7,8}";
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
	}
	@Test
	public void test4() {
		String pattern = "[A-CSW-Z]";
		String str = "_";
		System.out.println(str.matches(pattern));
	}
	@Test
	public void test5() {
		System.out.print("��J���ܸ��X:");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		String pattern = "0([1-9]\\d{1,3})-\\d{7,8}";
//		String pattern = "0[\\d&&[^0]]{1,3}-\\d{7,8}";
		if (input.matches(pattern)) {
			System.out.println(input+" �ŦX���ܸ��X�榡�C");
		}
		else {System.out.println(input+" ���ŦX���ܸ��X�榡�C");}
		
	}
	@Test
	public void test6() {
		System.out.print("��J�����Ҧr��(10�X):");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		String pattern = "^[\\w&&[^0-9ABD-FHabd-fh_]][1-2]\\d{8}$";
		if (input.matches(pattern)) {
			System.out.println(input+" �ŦX�����Ҧr���榡�C");
		}
		else {System.out.println(input+" ���ŦX�����Ҧr���榡�C");}
	}
}

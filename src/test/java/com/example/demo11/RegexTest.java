package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {
	@Test
	public void test0() {
		// \ 在 java 中表示跳脫符號，用來跳脫有特殊意義的符號 --> 讓有特殊意義的符號變成單純的字串
		// \ 跳脫符號無法單獨存在
		// \\ --> 第一個跳脫符號讓第二個跳脫符號從有特殊意義變成單純的字串 
		String pattern = "\\";
		System.out.println(pattern);
	}
	@Test
	public void test() {
		//比對手機號碼格式:4-3-3
		// \d 表示數字 0~9的任意其中一個
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		Scanner scan = new Scanner(System.in);
		System.out.print("輸入手機號碼(格式為 4-3-3) : ");
		String input = scan.next();
		boolean check = input.matches(pattern);
		if (check) { // 等同於 chenk == true
			System.out.println(input+" 符合手機號碼格式。");
		}
		else {
			System.out.println(input+" 不符合手機號碼格式。");
		}
		//============================================
		// 上面的變數 input.matches(pattern) 的結果用變數 check 接回來
		// 但在後續的程式碼中，變數 check 只使用了一次
		// 所以可以使用匿名(不需要用變數名稱來接計算的結果)的方式來改寫
		if (input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input+" 符合手機號碼格式。");
		}
		else {
			System.out.println(input+" 不符合手機號碼格式。");
		}
	}
	@Test
	public void test1() {
		//比對手機號碼格式:4-3-3
		// \d 表示數字 0~9的任意其中一個
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// 使用大括號 {} 處理 pattern 中重複出現的字串
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// 上一行 因為-\\d{3} 重複了2次，但{}只為針對前面的東西(\\d)，無法連續使用，所以使用小括號將整個-\\d{3}視為一個
		String pattern = "\\d{4}(-\\d{3}){2}";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("輸入手機號碼(格式為 4-3-3) : ");
		String input = scan.next();
		
		if (input.matches(pattern)) { // 等同於 input.matches(pattern) == true
			System.out.println(input+" 符合手機號碼格式。");
		}
		else {
			System.out.println(input+" 不符合手機號碼格式。");
		}
	}
	@Test
	public void test2() {
		//市話格式1:(xx)-xxxxxxx
		//市話格式2: xx -xxxxxxx
		String pattern1 = "\\d{2}-\\d{7}";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		System.out.print("輸入市話號碼(2-7):");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if (input.matches(pattern1)||input.matches(pattern2)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
		//=====================================================
		//合併 pattern1 pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (input.matches(pattern3)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
		//====================================================
		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
		if (input.matches(pattern4)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
	}
	//ch13 27 29
	@Test
	public void testwork27() {
		System.out.print("輸入市話號碼(2-7):");
		// 市話格式: 2-7~8or(2)7~8
		//xx-or(xx) 7~8
		String pattern = "(\\d{2}-|\\(\\d{2}\\))\\d{7,8}";
		// \\d{7,8} : 表示 \\d 至少出現7次，至多出現8次
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
	}
	@Test
	public void testwork29() {
		//區碼總共2~4碼 0開頭，號碼7~8碼 中間以-連接
		System.out.print("輸入市話號碼(2-7):");
		
		String pattern = "(0\\d{1,3})-\\d{7,8}";
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
	}
	@Test
	public void test4() {
		String pattern = "[A-CSW-Z]";
		String str = "_";
		System.out.println(str.matches(pattern));
	}
	@Test
	public void test5() {
		System.out.print("輸入市話號碼:");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		String pattern = "0([1-9]\\d{1,3})-\\d{7,8}";
//		String pattern = "0[\\d&&[^0]]{1,3}-\\d{7,8}";
		if (input.matches(pattern)) {
			System.out.println(input+" 符合市話號碼格式。");
		}
		else {System.out.println(input+" 不符合市話號碼格式。");}
		
	}
	@Test
	public void test6() {
		System.out.print("輸入身分證字號(10碼):");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		String pattern = "^[\\w&&[^0-9ABD-FHabd-fh_]][1-2]\\d{8}$";
		if (input.matches(pattern)) {
			System.out.println(input+" 符合身分證字號格式。");
		}
		else {System.out.println(input+" 不符合身分證字號格式。");}
	}
}

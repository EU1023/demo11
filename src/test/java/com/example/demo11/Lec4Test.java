package com.example.demo11;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class Lec4Test {
	
	private static final String Scanner = null;
	public void arrayTest() {
		int[] arr = new int[5];
	}
	//Arrays.sort();陣列排序 Arrays.toString()陣列可視化
	public void sensyuTest() {
		int[] sinpan = {5,4,3,4,1};
		int max = sinpan[0];
		int min = sinpan[0];
		for (int i : sinpan) {
			if (i>max) {
				max=i;
			}
			if (i<min) {
				min=i;
			}
		}
		int sum = 0;
		for (int j = 0; j<5;j++) {
			sum+=sinpan[j];
		}
		sum-=max-min;
		double heikin =sum;
		System.out.print("評審評分 分別為:");
		for (int s=0;s<5;s++) {
			System.out.print(sinpan[s]+" ");
		}
		System.out.println("");
		System.out.print("有效分數為:"+(heikin/5));
	}
	/*
	int[][] sinsei= {
			{5,8,6,5,7},
			{4,6,8,3,4},
			{5,6,5,4,6},
			{8,5,6,4,2},
			{3,4,1,2,1}
			};
	
	
	double sum=0.0;
	
	//5位評審的5次評分
	for(int m = 0; m<sinsei.length;m++) {
		int Min = Integer.MAX_VALUE;
		int Max = Integer.MIN_VALUE;
		int sum2=0;
		
		for (int score : sinsei[m]) {
			if (score>Max) {
				Max=score;
			}
			if (score<Min) {
				Min=score;
			}
			sum2+=score;
		}
		sum2=sum2-Max-Min;
		sum+=sum2;
	}
	
	System.out.println(sum);
	double heikin = sum/5;
	//捨去最高最低分，取平均
	for (int i = 0; i<5; i++) {
		System.out.print("評審"+(i+1)+"號:");
		for (int j = 0; j<5; j++) {
			System.out.print(sinsei[i][j]+"分 ");
		}
		System.out.println("");
	}
	//列印
	
	System.out.println("選手總平均分為:"+(heikin));
	*/
	
	public void listTest() {
		List<Integer> list = new ArrayList<>();//整數陣列格
		Random r = new Random();
		while(list.size()<4) { //list長度超過4時停止
			int kari = r.nextInt(10);
			//確保數字不重複
			if (!list.contains(kari)) { //list中不包含kari中的數值的時候，contains才回傳true，以此達到不重複
				list.add(kari); //不等於時放入，陣列長度增加
			}
		}
		for (int i = 0; i<4; i++) {
			System.out.print(list.get(i));
		}
		
	}
	
	
	
	
	public void list2Test() {
		System.out.print("輸入四個相異數字(0~9):");
		Scanner s = new Scanner(System.in);
		String siyosya = s.next();
		List<String> nyuryoku = new ArrayList<>(Arrays.asList(siyosya.split("")));//儲存使用者輸入
		
		int g=0;
		while(true) {//判斷是否為四位數
			if(nyuryoku.size()<4||nyuryoku.size()>4) {//輸入長度不到4位或超過4位時
				System.out.print("輸入錯誤 請輸入四位數(不重複):");
				siyosya = s.next();
				nyuryoku = new ArrayList<>(Arrays.asList(siyosya.split("")));//儲存使用者輸入
			}
			else {
				
			}
			break;			
		}
		
			
		/* 產生四位數亂數，且不重複*/
		System.out.println(nyuryoku);//確認輸入結果
		List<Integer> list = new ArrayList<>();//整數陣列格
		Random r = new Random();
		while(list.size()<4) { //list長度超過4時停止
			int kari = r.nextInt(10);
			//確保數字不重複
			if (!list.contains(kari)) { //contains 裡面有值才回傳true
				list.add(kari); 
			}
		}
		for (int i = 0; i<4; i++) {
			System.out.print(list.get(i));
		}
		
		/*判斷AB*/
		/*
		int a=0;
		int b=0;
		for(int j =0 ;j<4 ;j++) {
			//跑四次去判斷幾a幾b 以使用者輸入的4個數字和亂數生成的去比較
			for (int k = 0; k<4; k++) {
				if (j==k && nyuryoku.get(j) == list.get(k)) {
					a++;
				}
				else if(j!=k && nyuryoku.get(j) == list.get(k)) {
					b++;
				}
			}
		}
		if (a==4 && b==0) { //a=4 b沒有累積成歸零的情況下退出
		System.out.println("A "+ a + " B " + b);
		break;
		}
		System.out.println("A "+ a + " B " + b);
		a=0;
		b=0;
		*/
		}
}

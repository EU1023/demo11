package com.example.demo11;
import java.util.Scanner;
import java.util.Random;

import org.junit.jupiter.api.Test;
public class ArrayTest {
	/*
	public static void main(String[] args) {
		double sum = 0;
		int i = 0;
		Scanner s = new Scanner(System.in);
		double[] siyosya = new double[20]; //無法設置無窮陣列 所以預設20格範圍
		while(true){
			double randamu = s.nextDouble();
			if (randamu == 0) { //如果輸入0 計算總合平均並離開
				System.out.println("平均:"+sum/i);
				break;
			}
			else{ //輸入數字放入陣列，將陣列內變數放入總和變數
				System.out.println(randamu);
				siyosya[i] = randamu;
				sum += siyosya[i];
				i++;
			}
		}
	}
	*/
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	/*
	public static void main(String[] args) {
		//幾A幾B 4個
		Scanner s = new Scanner(System.in);
		//亂數用陣列格
		int[] Arbf = new int[4];
		//輸入用陣列格
		int[] siyosyaze = new int[4];
		//累積ab
		int a = 0; 
		int b = 0;
		//隨機產生4個數字 範圍在10以內
		Random random = new Random();
		for (int i =0; i<4; i++) {
			Arbf[i] = random.nextInt(9)+1;
			for (int i2=0; i2<i; i2++) {
				if (Arbf[i] == Arbf[i2]) {
					i--;
				}
			}//如果第i格跟i2重複了 for記數i變數-1 重跑 直到產生出不重複的亂數
		}
		
		System.out.println("------------------------");
		for (int g =0; g<4;g++) {
			System.out.print(Arbf[g]);//確認結果列印
		}
		System.out.println("");
		System.out.println("------------------------");
		
		System.out.println("請輸入猜數字的4個數字(範圍1~9)");
		System.out.println("------------------------");
		
		while(true) {//輸入猜的數字(分開輸入) 防呆禁止輸出大於範圍數或小於範圍數 不包含長度防呆
			int h=0;
			while(h<4) {
				System.out.println("請輸入數字:");
				int siyosya = s.nextInt();
				if (siyosya>=11 || siyosya<=0) {
					System.out.println("請輸入範圍內的數字。");
					System.out.println("------------------------");
				}
				else {
					siyosyaze[h]=siyosya;
					h++;
				}
			}
			System.out.println("------------------------");
			for(int j =0 ;j<4 ;j++) {
					//跑四次去判斷幾a幾b 以使用者輸入的4個數字和亂數生成的去比較
					for (int k = 0; k<4; k++) {
						if (j==k && siyosyaze[j] == Arbf[k]) {
							a++;
						}
						else if(j!=k && siyosyaze[j] == Arbf[k]) {
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
		}
	}
	*/
}

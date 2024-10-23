package com.example.demo11;
import java.util.*;

import org.junit.jupiter.api.Test;

public class ABGame {
	@Test
	public void listTest() {
		/*
		String pattern = "\\d{4}"; 正規表達化
		String input1 = "1234";
		String input2 = "-1234";
		System.out.println(input1.matches(pattern));
		System.out.println(input2.matches(pattern));
		*/
		String pattern = "\\d{4}";
		Scanner s = new Scanner(System.in);
		boolean w = false;
		List<Integer> r = randamu(); //呼叫randamu，收到亂數四位數值
		System.out.println(r);//確認亂數結果
		while(!w) {
			System.out.print("輸入四個相異數字(0~9):");
			String inpum = s.nextLine();
			
			if (!isValidInput(inpum)) {//
				System.out.println("輸入錯誤 請重新輸入:");
				continue;
			}
			
			List<Integer> Suji = sujika(inpum); //呼叫sujika，收到已經分割並被變成數值的inpum
			//
			int[] neulab = checkAB(r,Suji);//
			
			//
			System.out.println("A:"+neulab[0]+" B:"+neulab[1]);
			if (neulab[0]==4) {
				System.out.println("猜對囉");
				w=true;
			}
		}
		
	}
	//呼叫 輸入內容判斷
	public boolean isValidInput(String inpum) {
		if (inpum.length()!=4) {//長度不等於4時回傳false
			return false;
		}
			
		Set<Character> ng = new HashSet<>(); //set不允許重複物件存在 HeshSet則是在set的基礎下不允許重複的集合
		
		for(char c : inpum.toCharArray()) {//toCharArray為將inpum中的字串轉為數值
			if (!Character.isDigit(c)) {//判斷c中如果不是數字 回傳false
				return false;
			}
			ng.add(c); //如果是數值 c放入ng中
		}
		return ng.size()==4; //回傳ng長度等於4
	}
	
	//呼叫 亂數產生4位數
	public static List<Integer> randamu(){
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		while(list.size()<4) {
			int kari =r.nextInt(10);
			if (!list.contains(kari)) {
				list.add(kari);
			}
		}
		return list;	
	}
	
	//呼叫 將inpum陣列中的字串 分割 轉換為 數值 回傳
	public static List<Integer> sujika(String inpum){
		List<Integer> input = new ArrayList<>();
		for (char i:inpum.toCharArray()) {
			input.add(Character.getNumericValue(i));
		}
		return input;
	}
	
	//
	public static int[] checkAB(List<Integer> r,List<Integer> Suji) {
		int a=0,b =0;
		for (int i = 0;i<4;i++) {
			for(int j = 0;j<4;j++) {
				if (i==j&&r.get(i)==Suji.get(j)) {
					a++;
				}
				else if(i!=j && r.get(i)==Suji.get(j)) {
					b++;
				}
			}
		}
		return new int[] {a,b};
	}
}

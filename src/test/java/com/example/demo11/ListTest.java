package com.example.demo11;
import java.util.Scanner;
import java.util.List;
public class ListTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] a =new String[5];
		double sum = 0;
		String siyosya;
		int i = 0 ;
		for (i = 0 ; i<5; i++) {
			siyosya = s.nextLine();
			int num = Integer.parseInt(siyosya);
			if (num ==0) {
				System.out.println(sum/i);
				break;
			}
			else{
				a[i]=siyosya;
				sum+= Double.parseDouble(a[i]); //Double.parseDouble將字串轉換為數值
			}
		}
		System.out.println(sum/i);
	}
}

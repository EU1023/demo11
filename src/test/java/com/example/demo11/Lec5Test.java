package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec5Test {
	public void mathTest(){
		//Scanner s = new Scanner(System.in);
		//String AinD = s.next();
		//indexOf("",i);
		int a=0,b=0,c=0,d=0;
		String AinD = "AABCBDCDACBDA";
		String[] ABCD = AinD.split("");
		
		System.out.println(AinD.length());
		System.out.println(Arrays.toString(ABCD));
		
		for (int i = 0;i<AinD.length();i++) {
			String kari = "";
			kari = ABCD[i];
			if (kari.equals("A")) {
				a++;
			}
			else if(kari.equals("B")) {
				b++;
			}
			else if(kari.equals("C")) {
				c++;
			}
			else if(kari.equals("D")) { 
				d++;
			}
		}
		System.out.printf("%d個A %d個B %d個C %d個D",a,b,c,d);
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc"); 
		strBuf.append("ABC"); //append增加字串在原本的後面
		strBuf.append("DEF").append("QQQ");
		System.out.println(strBuf.toString());
	}
	//不使用StringBuffer來反轉字串的方法
	public void stringReverseTest() {
		String str = "abcde";
		String[] strArray = str.split("");
		
		String newS = "";
		for (int i = strArray.length - 1; i>=0;i--) {
			String item = strArray[i];
			newS = newS + item;
		}
		//============================
		StringBuffer strBuf = new StringBuffer(str);
		strBuf = strBuf.reverse();
		//使用StringBuffer來反轉字串 reverse(反向 反轉意思)
	}
}

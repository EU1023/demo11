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
		System.out.printf("%d��A %d��B %d��C %d��D",a,b,c,d);
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer strBuf = new StringBuffer("abc"); 
		strBuf.append("ABC"); //append�W�[�r��b�쥻���᭱
		strBuf.append("DEF").append("QQQ");
		System.out.println(strBuf.toString());
	}
	//���ϥ�StringBuffer�Ӥ���r�ꪺ��k
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
		//�ϥ�StringBuffer�Ӥ���r�� reverse(�ϦV ����N��)
	}
}

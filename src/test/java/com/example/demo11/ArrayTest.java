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
		double[] siyosya = new double[20]; //�L�k�]�m�L�a�}�C �ҥH�w�]20��d��
		while(true){
			double randamu = s.nextDouble();
			if (randamu == 0) { //�p�G��J0 �p���`�X���������}
				System.out.println("����:"+sum/i);
				break;
			}
			else{ //��J�Ʀr��J�}�C�A�N�}�C���ܼƩ�J�`�M�ܼ�
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
		//�XA�XB 4��
		Scanner s = new Scanner(System.in);
		//�üƥΰ}�C��
		int[] Arbf = new int[4];
		//��J�ΰ}�C��
		int[] siyosyaze = new int[4];
		//�ֿnab
		int a = 0; 
		int b = 0;
		//�H������4�ӼƦr �d��b10�H��
		Random random = new Random();
		for (int i =0; i<4; i++) {
			Arbf[i] = random.nextInt(9)+1;
			for (int i2=0; i2<i; i2++) {
				if (Arbf[i] == Arbf[i2]) {
					i--;
				}
			}//�p�G��i���i2���ƤF for�O��i�ܼ�-1 ���] ���첣�ͥX�����ƪ��ü�
		}
		
		System.out.println("------------------------");
		for (int g =0; g<4;g++) {
			System.out.print(Arbf[g]);//�T�{���G�C�L
		}
		System.out.println("");
		System.out.println("------------------------");
		
		System.out.println("�п�J�q�Ʀr��4�ӼƦr(�d��1~9)");
		System.out.println("------------------------");
		
		while(true) {//��J�q���Ʀr(���}��J) ���b�T���X�j��d��ƩΤp��d��� ���]�t���ר��b
			int h=0;
			while(h<4) {
				System.out.println("�п�J�Ʀr:");
				int siyosya = s.nextInt();
				if (siyosya>=11 || siyosya<=0) {
					System.out.println("�п�J�d�򤺪��Ʀr�C");
					System.out.println("------------------------");
				}
				else {
					siyosyaze[h]=siyosya;
					h++;
				}
			}
			System.out.println("------------------------");
			for(int j =0 ;j<4 ;j++) {
					//�]�|���h�P�_�Xa�Xb �H�ϥΪ̿�J��4�ӼƦr�M�üƥͦ����h���
					for (int k = 0; k<4; k++) {
						if (j==k && siyosyaze[j] == Arbf[k]) {
							a++;
						}
						else if(j!=k && siyosyaze[j] == Arbf[k]) {
							b++;
						}
					}
			}
			if (a==4 && b==0) { //a=4 b�S���ֿn���k�s�����p�U�h�X
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

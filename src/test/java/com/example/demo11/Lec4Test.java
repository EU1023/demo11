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
	//Arrays.sort();�}�C�Ƨ� Arrays.toString()�}�C�i����
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
		System.out.print("���f���� ���O��:");
		for (int s=0;s<5;s++) {
			System.out.print(sinpan[s]+" ");
		}
		System.out.println("");
		System.out.print("���Ĥ��Ƭ�:"+(heikin/5));
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
	
	//5����f��5������
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
	//�˥h�̰��̧C���A������
	for (int i = 0; i<5; i++) {
		System.out.print("���f"+(i+1)+"��:");
		for (int j = 0; j<5; j++) {
			System.out.print(sinsei[i][j]+"�� ");
		}
		System.out.println("");
	}
	//�C�L
	
	System.out.println("����`��������:"+(heikin));
	*/
	
	public void listTest() {
		List<Integer> list = new ArrayList<>();//��ư}�C��
		Random r = new Random();
		while(list.size()<4) { //list���׶W�L4�ɰ���
			int kari = r.nextInt(10);
			//�T�O�Ʀr������
			if (!list.contains(kari)) { //list�����]�tkari�����ƭȪ��ɭԡAcontains�~�^��true�A�H���F�줣����
				list.add(kari); //������ɩ�J�A�}�C���׼W�[
			}
		}
		for (int i = 0; i<4; i++) {
			System.out.print(list.get(i));
		}
		
	}
	
	
	
	
	public void list2Test() {
		System.out.print("��J�|�Ӭ۲��Ʀr(0~9):");
		Scanner s = new Scanner(System.in);
		String siyosya = s.next();
		List<String> nyuryoku = new ArrayList<>(Arrays.asList(siyosya.split("")));//�x�s�ϥΪ̿�J
		
		int g=0;
		while(true) {//�P�_�O�_���|���
			if(nyuryoku.size()<4||nyuryoku.size()>4) {//��J���פ���4��ζW�L4���
				System.out.print("��J���~ �п�J�|���(������):");
				siyosya = s.next();
				nyuryoku = new ArrayList<>(Arrays.asList(siyosya.split("")));//�x�s�ϥΪ̿�J
			}
			else {
				
			}
			break;			
		}
		
			
		/* ���ͥ|��ƶüơA�B������*/
		System.out.println(nyuryoku);//�T�{��J���G
		List<Integer> list = new ArrayList<>();//��ư}�C��
		Random r = new Random();
		while(list.size()<4) { //list���׶W�L4�ɰ���
			int kari = r.nextInt(10);
			//�T�O�Ʀr������
			if (!list.contains(kari)) { //contains �̭����Ȥ~�^��true
				list.add(kari); 
			}
		}
		for (int i = 0; i<4; i++) {
			System.out.print(list.get(i));
		}
		
		/*�P�_AB*/
		/*
		int a=0;
		int b=0;
		for(int j =0 ;j<4 ;j++) {
			//�]�|���h�P�_�Xa�Xb �H�ϥΪ̿�J��4�ӼƦr�M�üƥͦ����h���
			for (int k = 0; k<4; k++) {
				if (j==k && nyuryoku.get(j) == list.get(k)) {
					a++;
				}
				else if(j!=k && nyuryoku.get(j) == list.get(k)) {
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
		*/
		}
}

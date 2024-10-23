package com.example.demo11;
import java.util.*;

import org.junit.jupiter.api.Test;

public class ABGame {
	@Test
	public void listTest() {
		/*
		String pattern = "\\d{4}"; ���W��F��
		String input1 = "1234";
		String input2 = "-1234";
		System.out.println(input1.matches(pattern));
		System.out.println(input2.matches(pattern));
		*/
		String pattern = "\\d{4}";
		Scanner s = new Scanner(System.in);
		boolean w = false;
		List<Integer> r = randamu(); //�I�srandamu�A����üƥ|��ƭ�
		System.out.println(r);//�T�{�üƵ��G
		while(!w) {
			System.out.print("��J�|�Ӭ۲��Ʀr(0~9):");
			String inpum = s.nextLine();
			
			if (!isValidInput(inpum)) {//
				System.out.println("��J���~ �Э��s��J:");
				continue;
			}
			
			List<Integer> Suji = sujika(inpum); //�I�ssujika�A����w�g���ΨóQ�ܦ��ƭȪ�inpum
			//
			int[] neulab = checkAB(r,Suji);//
			
			//
			System.out.println("A:"+neulab[0]+" B:"+neulab[1]);
			if (neulab[0]==4) {
				System.out.println("�q���o");
				w=true;
			}
		}
		
	}
	//�I�s ��J���e�P�_
	public boolean isValidInput(String inpum) {
		if (inpum.length()!=4) {//���פ�����4�ɦ^��false
			return false;
		}
			
		Set<Character> ng = new HashSet<>(); //set�����\���ƪ���s�b HeshSet�h�O�bset����¦�U�����\���ƪ����X
		
		for(char c : inpum.toCharArray()) {//toCharArray���Ninpum�����r���ର�ƭ�
			if (!Character.isDigit(c)) {//�P�_c���p�G���O�Ʀr �^��false
				return false;
			}
			ng.add(c); //�p�G�O�ƭ� c��Jng��
		}
		return ng.size()==4; //�^��ng���׵���4
	}
	
	//�I�s �üƲ���4���
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
	
	//�I�s �Ninpum�}�C�����r�� ���� �ഫ�� �ƭ� �^��
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

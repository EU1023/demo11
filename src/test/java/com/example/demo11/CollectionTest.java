package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {
	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List �O����(interface)�A�u�O�Ψөw�q��k�Ӥw�A�õL�����@���e�F�ҥH�L�k�ϥ� new �إ߹��
		// ArrayList �O�Ψӹ�{�w�q�b List ����k����@���O
		List<Bank> list = new ArrayList<>();
		// List <>������ƫ��A�����8�ذ򥻸�ƫ��A�A�N��N�O�u������O(class)
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(4);
		intlist.add(5);
		intlist.add(1);
		intlist.add(2, 9);
		for (Integer i : intlist) {
			System.out.println(i);
		}
		System.out.println("==============");
		intlist.remove(2);
		for (Integer i : intlist) {
			System.out.println(i);
		}
	}
	
	@Test
	public void listTest1() {
		List<String> strlist = new ArrayList<>();
		strlist.add("A");
		strlist.add("B");
		strlist.add("C");
		strlist.add("D");
		for(int i = 0; i < strlist.size();i++) {
			if (strlist.get(i).equals("B")) {
				strlist.remove(strlist.get(i));
			}
			System.out.println(strlist.get(i));
		}
		//�ϥ� for �ɤ��i�H���ܩw�q�j��ƪ��ܼ�
//		for (String i : strlist) {
//			System.out.println(i);
//		}
		
	}
	//list ���Ĥ@ ���̫��
	@Test
	public void listTest2() {
		LinkedList<String> list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		List<String> strlist = new ArrayList<>();
		strlist.add("A");
		strlist.add("B");
		strlist.add("C");
		strlist.add("D");
		System.out.println(strlist.get(0));
		System.out.println(strlist.get(strlist.size()-1));
		
	}
	
	@Test
	public void hashSetTest(){  //ctrl+shift+o �ֳt��J���� 
							//			+f �ֳt�ƪ�
		//HasSet
		//1. �ۦP�������u�|�O�d1��(�����\����)
		//2. �L�ǱƧ�(���|�̷ӷs�W�����T�ӱƦC)
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("D");
		strSet.add("A");
		strSet.add("E");
		for (String item : strSet) {
			System.out.println(item);
		}
	}
	@Test
	public void linkedHashsetTest(){  //ctrl+shift+o �ֳt��J���� 
							//			+f �ֳt�ƪ�
		//LinkedHashSet
		//1. �ۦP�������u�|�O�d1��(�����\����)
		//2. ����(�|�̷ӷs�W�����T�ӱƦC)
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("D");
		strSet.add("A");
		strSet.add("E");
		for (String item : strSet) {
			System.out.println(item);
		}
	}
	
	@Test
	public void treeSetTest(){  //ctrl+shift+o �ֳt��J���� 
							//			+f �ֳt�ƪ�
		//treeSet
		//1. �ۦP�������u�|�O�d1��(�����\����)
		//2. �Ѥp��j�ƦC
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("D");
		strSet.add("A");
		strSet.add("E");
		for (String item : strSet) {
			System.out.println(item);
		}
	}
	
	@Test
	public void setrensyu() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		//����5�Ӥ����ƪ��Ʀr
		// for(; set.size()<=5) for�j�骺�L�a�j��
		while(set.size()<5) {
//			int randamu = r.nextInt(9)+1;
//			if (!set.contains(randamu)) {
//				set.add(randamu);
//			}
			//set�����\���ƼƦr ��l�i�ٲ�
			set.add(r.nextInt(9)+1);
		}
		System.out.println(set);
		//�Nset�����ȩ�Jlist
		List<Integer> list = new ArrayList<>(set);
		//�ѫ᩹�e�C�L(�]��set�w�g�Ѥp��j�Ʀn�F �˹L�ӴN�O�j��p)
		//reverse:����
		//Collections.reverse(list);
		
		for (int i=list.size()-1; i>=0;i--) {
			System.out.print(list.get(i));
		}
		System.out.println("");
		System.out.println("Max: "+list.get(list.size()-1)+" Min: "+list.get(0));
	}
	//�}�C�w�q��TreeSet��k
	public void setTest1() {
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()<5) {
			set.add(r.nextInt(9)+1);
		}
		System.out.println(set.first());
		System.out.println(set.last());
		//�Ѥp��j
		System.out.println();
		//�Ѥj��p
		System.out.println(set.descendingSet());
	}
	//�ഫ���A����k
	public void setTest2() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		
		while(set.size()<5) {
			set.add(r.nextInt(9)+1);
		}
		//�૬: �N�Ȫ���ƫ��A�ഫ���t�@�ث��A
		//1. �Q�૬����ƫ��A�@�w�n���p�A��() �B�����g�b�ܼƫe���C�Ҧp�U�誺((TreeSet<Integer>) set)
		//2. �ϥΤp�A���N�ഫ����ƫ��A�M�ܼƮئb�@�_�A�o�ˤ~�|�Q�����O�@���ഫ�᪺�ܼ�
		//3. �V��
		System.out.println(((TreeSet<Integer>) set).first());
		System.out.println(((TreeSet<Integer>) set).last());
	}
	
	@Test
	public void mapTest() {
		// Map<key ����ƫ��A�A value ����ƫ��A>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		// �ϥ� get(key ��) �z�L key �N������ value ���X
		String str = map.get(2);
		System.out.println(str);
		// �M��: �ϥ� foreach �N map ���� key-value ���X
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("========================");
		// �N map �ন keySet�A�C�� item �N��ܤ@�� key�A�z�L get(item) �N������ value ���X
		for(Integer item : map.keySet()) {
			System.out.println("key: "+ item);
			System.out.println("value: "+ map.get(item));
		}
		System.out.println("========================");
		// �쥻 map ���A�w�s�b key = 1 �H�ι����� value = A;
		// �{�b�b�ۦP1����m��J D�Akey = 1 ������� value �|�ܦ� D(�ۦP key�A������ value ��\�e)
		map.put(1, "D");
		// ���P�� key �A�i�H��J�ۦP�Τ��P������ value
		map.put(4, "D");
		for(Integer item : map.keySet()) {
			System.out.println("key: "+ item);
			System.out.println("value: "+ map.get(item));
		}
	}
	
	@Test
	public void mapTest2() {
		// key-value �O 1��1
		Map<Integer, String> map = new HashMap<>();
		// key-value �O 1��h
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<String,String>> map5 = new HashMap<>();
	}
	
	@Test
	public void maptest3() {
		// isEmpty(): �߰ݶ��X�άO map �� size �O�_�� 0(�Ū�)
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//===========
		
		List<String> list2 = null;
		// �]�� list2 �O null�A�ҥH�L�k�ϥ� null .��k() �Ӱ���{���A�|����
		// �U��{���|�� NullPointerException(�ū��w���~)
		System.out.println(list2.isEmpty());
	}
	//��Ƥ��M leetcode
	@Test
	public void maphomowork() {
		int nums[]= {2,7,11,15};
		HashMap<Integer,Integer> map = new HashMap<>();
//		nums.put(2, 0);
//		nums.put(7, 1);
//		nums.put(11, 2);
//		nums.put(15, 3);
		
		int narget = 9;
		int[] kotae = new int[2];
		for (int i = 0; i<nums.length;i++) {
			//key=9-[2,7,11,15]
//			System.out.println(narget+" - "+nums[i]);
//			System.out.println(map.containsKey(narget-nums[i]));
			//�p�Gmap�̦�narget-nums[i]�����G �i�Jif
			if (map.containsKey(narget-nums[i])) {
				//map.get��2  (9-7)�A ��map�̦�(2,0) �ҥHkotae[0]���ȩ�0
				kotae[0]= map.get(narget - nums[i]);
				kotae[1]=i;
//				System.out.println("=====================");
//				System.out.println(kotae[0]+" , "+kotae[1]);
//				System.out.println("=====================");
				break;
			}
			//map(2,0)(7,1)(11,2)(15,3)
			map.put(nums[i], i);
//			System.out.println(map);
		}
		System.out.println(Arrays.toString(kotae));
		/*
		i=0 �A9-2  > map.k(false)  > map(2,0)
		i=1  �A9-7 > map.k(true) (�̭���map(2,0) 
		k[0]��Jmap(2,0)���� 0
		k[1] ��Ji  i=1 �ҥH�O1 
		 */
//		int nums[]= {2,7,11,15};
		
//		for (int i=0;i<=nums.length; i++) {
//			for(int j=0; j<=nums.length; j++) {
//				if (nums.get(i) != nums.get(j) {
//					if (nums.get(i)+nums.get(j)==narget) {
//						System.out.printf("[ %d , %d ]",nums.get(i),nums.get(j));
//					}
//				}
//			}
//		}
	}
	
	
}

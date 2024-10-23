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
		// List 是介面(interface)，只是用來定義方法而已，並無任何實作內容；所以無法使用 new 建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別
		List<Bank> list = new ArrayList<>();
		// List <>中的資料型態不能放8種基本資料型態，意思就是只能放類別(class)
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
		//使用 for 時不可以改變定義迴圈數的變數
//		for (String i : strlist) {
//			System.out.println(i);
//		}
		
	}
	//list 取第一 取最後值
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
	public void hashSetTest(){  //ctrl+shift+o 快速放入插件 
							//			+f 快速排版
		//HasSet
		//1. 相同的元素只會保留1個(不允許重複)
		//2. 無序排序(不會依照新增的順訊來排列)
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
	public void linkedHashsetTest(){  //ctrl+shift+o 快速放入插件 
							//			+f 快速排版
		//LinkedHashSet
		//1. 相同的元素只會保留1個(不允許重複)
		//2. 有序(會依照新增的順訊來排列)
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
	public void treeSetTest(){  //ctrl+shift+o 快速放入插件 
							//			+f 快速排版
		//treeSet
		//1. 相同的元素只會保留1個(不允許重複)
		//2. 由小到大排列
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
		//產生5個不重複的數字
		// for(; set.size()<=5) for迴圈的無窮迴圈
		while(set.size()<5) {
//			int randamu = r.nextInt(9)+1;
//			if (!set.contains(randamu)) {
//				set.add(randamu);
//			}
			//set不允許重複數字 其餘可省略
			set.add(r.nextInt(9)+1);
		}
		System.out.println(set);
		//將set中的值放入list
		List<Integer> list = new ArrayList<>(set);
		//由後往前列印(因為set已經由小到大排好了 倒過來就是大到小)
		//reverse:反轉
		//Collections.reverse(list);
		
		for (int i=list.size()-1; i>=0;i--) {
			System.out.print(list.get(i));
		}
		System.out.println("");
		System.out.println("Max: "+list.get(list.size()-1)+" Min: "+list.get(0));
	}
	//陣列定義為TreeSet方法
	public void setTest1() {
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()<5) {
			set.add(r.nextInt(9)+1);
		}
		System.out.println(set.first());
		System.out.println(set.last());
		//由小到大
		System.out.println();
		//由大到小
		System.out.println(set.descendingSet());
	}
	//轉換型態的方法
	public void setTest2() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		
		while(set.size()<5) {
			set.add(r.nextInt(9)+1);
		}
		//轉型: 將值的資料型態轉換成另一種型態
		//1. 被轉型的資料型態一定要有小括號() 且必須寫在變數前面。例如下方的((TreeSet<Integer>) set)
		//2. 使用小括號將轉換的資料型態和變數框在一起，這樣才會被視為是一個轉換後的變數
		//3. 慎用
		System.out.println(((TreeSet<Integer>) set).first());
		System.out.println(((TreeSet<Integer>) set).last());
	}
	
	@Test
	public void mapTest() {
		// Map<key 的資料型態， value 的資料型態>
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		// 使用 get(key 值) 透過 key 將對應的 value 取出
		String str = map.get(2);
		System.out.println(str);
		// 遍歷: 使用 foreach 將 map 中的 key-value 取出
		for (Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("========================");
		// 將 map 轉成 keySet，每個 item 就表示一個 key，透過 get(item) 將對應的 value 取出
		for(Integer item : map.keySet()) {
			System.out.println("key: "+ item);
			System.out.println("value: "+ map.get(item));
		}
		System.out.println("========================");
		// 原本 map 中，已存在 key = 1 以及對應的 value = A;
		// 現在在相同1的位置放入 D，key = 1 其對應的 value 會變成 D(相同 key，對應的 value 後蓋前)
		map.put(1, "D");
		// 不同的 key ，可以放入相同或不同的對應 value
		map.put(4, "D");
		for(Integer item : map.keySet()) {
			System.out.println("key: "+ item);
			System.out.println("value: "+ map.get(item));
		}
	}
	
	@Test
	public void mapTest2() {
		// key-value 是 1對1
		Map<Integer, String> map = new HashMap<>();
		// key-value 是 1對多
		Map<Integer, String[]> map2 = new HashMap<>();
		Map<Integer, List<String>> map3 = new HashMap<>();
		Map<Integer, Set<String>> map4 = new HashMap<>();
		Map<Integer, Map<String,String>> map5 = new HashMap<>();
	}
	
	@Test
	public void maptest3() {
		// isEmpty(): 詢問集合或是 map 其 size 是否為 0(空的)
		List<String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map<Integer, String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//===========
		
		List<String> list2 = null;
		// 因為 list2 是 null，所以無法使用 null .方法() 來執行程式，會報錯
		// 下行程式會報 NullPointerException(空指針錯誤)
		System.out.println(list2.isEmpty());
	}
	//兩數之和 leetcode
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
			//如果map裡有narget-nums[i]的結果 進入if
			if (map.containsKey(narget-nums[i])) {
				//map.get到2  (9-7)， 而map裡有(2,0) 所以kotae[0]的值放0
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
		i=0 ，9-2  > map.k(false)  > map(2,0)
		i=1  ，9-7 > map.k(true) (裡面有map(2,0) 
		k[0]放入map(2,0)的值 0
		k[1] 放入i  i=1 所以是1 
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

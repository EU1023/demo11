package com.example.demo11;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Lec2Test {
	@Test
	public void reviewLec1(){
		int a ;
		String b = "1111";
	}
	
	public void commentTest() {
		//單行註解
		/*
		 * 多行註解
		 */
		this.fileCommentTest(0);
	}
	
	
	/**
	 * 
	 * @param test 書本的ISBN編號
	 * @return 書本名稱
	 */
	//當有回傳值時 文件註解會直接放入回傳值
	public String fileCommentTest(int test) {
		return null;
		
	}
	@Test
	public void computeTest() {
		int remaidar = 10%3;
		int quotient = 10/3;
		System.out.println("10 除以 3 的餘數是"+ remaidar);
		System.out.println("10 除以 3 的商數是"+ quotient);
		
		int a = 10;
		System.out.println(a);
		System.out.println(a++ * 10); //a*10, a = a*1
		System.out.println(a);
		
		System.out.println("-------------------------");
		
		a = 10;
		System.out.println(a);
		System.out.println(++a * 10); // a = a+1 , a*10 
		System.out.println(a);
	}
	@Test
	public void ennsasuTest() {
		
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		System.out.println(a+9);
		System.out.println(a--);
		System.out.println(a*5);
		System.out.println(a/5);
		System.out.println(a%b);
		System.out.println(b%a);
	}
	
	@Test
	public void dnchesuretuTest() {
		Scanner s = new Scanner(System.in); 
		int a = s.nextInt();
		int b = s.nextInt();
		//輸入 起始值 末值
		int rsum = this.sum(a,b);
		//呼叫sum
		System.out.println(a+" 到 "+b+" 總和是:"+rsum);
		//回傳後列印
	}
	public int sum(int a, int b) {
		int sum;
		sum = ((a + b) * (b - a + 1) / 2);
		//a為初始值 b為末值 a先加b 乘以 b減a+1 後 除以2
		return sum;
	}
	
	@Test
	public void ondoTest() {
		//攝氏換算成華氏
		Scanner s = new Scanner(System.in);
		
		System.out.println("輸入攝氏溫度:(c)");
		double celsius = s.nextInt();
		//fahrenheit是華氏，celsius是攝氏
		double fs = this.ondokeisanf(celsius);
		System.out.println("華氏溫度為: "+ fs +"\n");
		
		//華氏換算成攝氏
		System.out.println("輸入華氏溫度:(f)");
		double fahrenheit = s.nextInt();
		//fahrenheit是華氏，celsius是攝氏
		double cs = this.ondokesanc(fahrenheit);
		System.out.println("攝氏溫度為: "+cs + "\n");
	}
	public double ondokeisanf(double celsius) {
		//攝氏公式
		double fs;
		fs = celsius * 9 / 5 +32;
		//cs = ((fahrenheit -32)*5)/9;
		return fs;
	}
	
	public double ondokesanc(double fahrenheit) {
		//華氏公式
		double cs;
		cs = (fahrenheit -32)*5/9;
		//fs = celsius * 9 / 5 +32;
		return cs;
	}
	@Test
	public void dnchesuretuTest2() {
		Scanner s = new Scanner(System.in); 
		int end = s.nextInt();
		//輸入末值
		int rsum = this.sum2(end);
		//呼叫sum2
		System.out.println("1 到 "+end+" 總和是:"+rsum);
		//回傳後列印
	}
	public int sum2(int end) {
		int sum = 0;
		for (int i = 1; i<=end;i++) {
			sum+=i;
		}
		//以end為終點值 sum+i直到超過或等於end離開迴圈
		return sum;
	}
	
	@Test
	public void hatinosuTest() {
		int a = 0;
		for (int i = 1; i <= 9; i++ ) {
			for (int j = 1; j <= 9; j++) {
				a = i * j;
				System.out.printf("%d * %d =%2d ", j, i, a);
			}
			System.out.println(" ");
		}
	}
	
	@Test
	public void wdsum() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int end = s.nextInt();
		int rsum = this.wdsumkeka(i,end);
		//呼叫wdsumkeka
		System.out.println(i + " 到 " + end +" 總和是:" + rsum);
	}
	public int wdsumkeka(int i ,int end) {
		int sum = 0;
		while (i<=end) {
			sum+=i;
			i++;
		}
		//while迴圈方式加總
		return sum;
	}
	
	@Test
	public void whihatinosu() {
		int i=1 ,j =1;
		int sum=0;
		while (i<=9) {
			while (j<=9) {
				sum = i * j;
				System.out.printf("%d * %d = %2d ",j,i,sum);
				j++;
			}
			System.out.println("");
			j=1;
			i++;
		}
	}
	
	@Test
	public void dowhTest() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int end = s.nextInt();
		int rsum = this.dowhkeisan(a, end);
		System.out.println(a + " 到 " + end +" 總和是:" + rsum);
	}
	public int dowhkeisan(int a,int end) {
		int sum=0;
		do {
			sum+=a;
			a++;
		}while (a<=end);
		//先執行先前加總，後增加a的基數
		return sum;
	}
	//雞與兔子 不是用變數依然不清楚計算的根據
	@Test
	public void usagitoriTest() {
		int tori = 0;
		int usagi;
		while(true){
			usagi = 35 - tori;
			if (usagi * 4 + tori * 2 ==100) {
				System.out.printf("雞有 %d 隻和兔子有 %d 隻",tori,usagi);
				break;
			}
			tori++;
		}
	}
	
	@Test
	public void tiketoTest() {
		Scanner s = new Scanner(System.in);
		System.out.print("輸入年齡: ");
		double tosi = s.nextDouble();
		double toke = this.tiketonenrei(tosi);
		System.out.printf("需付: %.0f",toke);
		//捨去小數位
	}
	
	public double tiketonenrei(double tosi) {
		double toke = 0;
		if (tosi>=7 && tosi <=12 || tosi>=60 && tosi <=79){
			toke=100*0.5;
		} 	
		else if(tosi<=6 || tosi>=80){
			toke=100*0.2;
		}
		else toke=100;
		//if 第一段判斷7歲到12歲和60歲到79歲 第二判斷6歲(含)以下和80歲(含)以上 其餘都100元
		return toke;
	}
	@Test
	public void swseisegiTest() {
		Scanner s = new Scanner(System.in);
		System.out.print("輸入成績: ");
		int gakuse = s.nextInt();
		String ranku = this.seisegi(gakuse);
		//將呼叫後回傳的值改為字串接收
		System.out.println("你的成績級數: "+ranku);
	}
	
	public String seisegi(int gakuse) {
		String ranku="";
		switch(gakuse/10) {
		case 10:
			ranku = "A";
			break;
		case 9:
			ranku = "A";
			break;
		case 8:
			ranku = "B";
			break;
		case 7:
			ranku = "C";
			break;
		case 6:
			ranku = "D";
			break;
		default:
			ranku = "F";
			break;
		}
		//先將成績除以10，以商的值作為成績級數的判斷
		return ranku;
	}
	
	
	
	//不斷以新的最大值和最小值產生新亂數 //**試著去簡化它**
	@Test
	public void randamusuTest() {
		Scanner s = new Scanner(System.in);
		int radamu =(int)(Math.random()*97)+2;
		System.out.print("猜一個數(1~99):");
		int siyosya = s.nextInt();
		String ageru = this.radamusukeisan(siyosya,radamu);
		System.out.println(ageru);
	}
	public String radamusukeisan(int siyosya,int radamu) {
		Scanner s = new Scanner(System.in);
		int i = 1;
		int radamukari = 0;
		String kotae;
		while (true) {
			if(siyosya>=100 || siyosya<=0) {
				System.out.println("請輸入1~99以內:");
				siyosya = s.nextInt();
			}
			else if (siyosya!=radamu && i==1) {
				radamukari = siyosya; //暫存使用者輸入數值
				radamu =(int)(Math.random()*siyosya)+1; //***如果直接輸入1 範圍會被直接縮減到1~1之間***
				System.out.println(radamu);//答案確認
				System.out.printf("1猜一個新數(1 ~ %d):",siyosya);
				//以第一次輸入的數作為亂數的最大值
				siyosya = s.nextInt();
				//輸入新猜的數 
				i=2;
			}
			else if (siyosya!=radamu && i==2) {
				radamu =(int)(Math.random()*(radamukari-siyosya+1))+siyosya;
				//以使用者輸入的數值作為最大值去取亂數
				System.out.println(radamu);//答案確認
				System.out.printf("2猜一個新數(%d ~ %d) :",siyosya,radamukari);
				//以第一次輸入的數作為亂數的最大值
				siyosya = s.nextInt();
				//輸入新猜的數
				i=1;
			}
			else {
				kotae="猜對囉";
				break;
			}
		}
		return kotae;
	}
}

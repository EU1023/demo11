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
		//������
		/*
		 * �h�����
		 */
		this.fileCommentTest(0);
	}
	
	
	/**
	 * 
	 * @param test �ѥ���ISBN�s��
	 * @return �ѥ��W��
	 */
	//���^�ǭȮ� �����ѷ|������J�^�ǭ�
	public String fileCommentTest(int test) {
		return null;
		
	}
	@Test
	public void computeTest() {
		int remaidar = 10%3;
		int quotient = 10/3;
		System.out.println("10 ���H 3 ���l�ƬO"+ remaidar);
		System.out.println("10 ���H 3 ���ӼƬO"+ quotient);
		
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
		//��J �_�l�� ����
		int rsum = this.sum(a,b);
		//�I�ssum
		System.out.println(a+" �� "+b+" �`�M�O:"+rsum);
		//�^�ǫ�C�L
	}
	public int sum(int a, int b) {
		int sum;
		sum = ((a + b) * (b - a + 1) / 2);
		//a����l�� b������ a���[b ���H b��a+1 �� ���H2
		return sum;
	}
	
	@Test
	public void ondoTest() {
		//��󴫺⦨�ؤ�
		Scanner s = new Scanner(System.in);
		
		System.out.println("��J���ū�:(c)");
		double celsius = s.nextInt();
		//fahrenheit�O�ؤ�Acelsius�O���
		double fs = this.ondokeisanf(celsius);
		System.out.println("�ؤ�ū׬�: "+ fs +"\n");
		
		//�ؤ󴫺⦨���
		System.out.println("��J�ؤ�ū�:(f)");
		double fahrenheit = s.nextInt();
		//fahrenheit�O�ؤ�Acelsius�O���
		double cs = this.ondokesanc(fahrenheit);
		System.out.println("���ū׬�: "+cs + "\n");
	}
	public double ondokeisanf(double celsius) {
		//��󤽦�
		double fs;
		fs = celsius * 9 / 5 +32;
		//cs = ((fahrenheit -32)*5)/9;
		return fs;
	}
	
	public double ondokesanc(double fahrenheit) {
		//�ؤ󤽦�
		double cs;
		cs = (fahrenheit -32)*5/9;
		//fs = celsius * 9 / 5 +32;
		return cs;
	}
	@Test
	public void dnchesuretuTest2() {
		Scanner s = new Scanner(System.in); 
		int end = s.nextInt();
		//��J����
		int rsum = this.sum2(end);
		//�I�ssum2
		System.out.println("1 �� "+end+" �`�M�O:"+rsum);
		//�^�ǫ�C�L
	}
	public int sum2(int end) {
		int sum = 0;
		for (int i = 1; i<=end;i++) {
			sum+=i;
		}
		//�Hend�����I�� sum+i����W�L�ε���end���}�j��
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
		//�I�swdsumkeka
		System.out.println(i + " �� " + end +" �`�M�O:" + rsum);
	}
	public int wdsumkeka(int i ,int end) {
		int sum = 0;
		while (i<=end) {
			sum+=i;
			i++;
		}
		//while�j��覡�[�`
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
		System.out.println(a + " �� " + end +" �`�M�O:" + rsum);
	}
	public int dowhkeisan(int a,int end) {
		int sum=0;
		do {
			sum+=a;
			a++;
		}while (a<=end);
		//��������e�[�`�A��W�[a�����
		return sum;
	}
	//���P�ߤl ���O���ܼƨ̵M���M���p�⪺�ھ�
	@Test
	public void usagitoriTest() {
		int tori = 0;
		int usagi;
		while(true){
			usagi = 35 - tori;
			if (usagi * 4 + tori * 2 ==100) {
				System.out.printf("���� %d ���M�ߤl�� %d ��",tori,usagi);
				break;
			}
			tori++;
		}
	}
	
	@Test
	public void tiketoTest() {
		Scanner s = new Scanner(System.in);
		System.out.print("��J�~��: ");
		double tosi = s.nextDouble();
		double toke = this.tiketonenrei(tosi);
		System.out.printf("�ݥI: %.0f",toke);
		//�˥h�p�Ʀ�
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
		//if �Ĥ@�q�P�_7����12���M60����79�� �ĤG�P�_6��(�t)�H�U�M80��(�t)�H�W ��l��100��
		return toke;
	}
	@Test
	public void swseisegiTest() {
		Scanner s = new Scanner(System.in);
		System.out.print("��J���Z: ");
		int gakuse = s.nextInt();
		String ranku = this.seisegi(gakuse);
		//�N�I�s��^�Ǫ��ȧאּ�r�걵��
		System.out.println("�A�����Z�ż�: "+ranku);
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
		//���N���Z���H10�A�H�Ӫ��ȧ@�����Z�żƪ��P�_
		return ranku;
	}
	
	
	
	//���_�H�s���̤j�ȩM�̤p�Ȳ��ͷs�ü� //**�յۥh²�ƥ�**
	@Test
	public void randamusuTest() {
		Scanner s = new Scanner(System.in);
		int radamu =(int)(Math.random()*97)+2;
		System.out.print("�q�@�Ӽ�(1~99):");
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
				System.out.println("�п�J1~99�H��:");
				siyosya = s.nextInt();
			}
			else if (siyosya!=radamu && i==1) {
				radamukari = siyosya; //�Ȧs�ϥΪ̿�J�ƭ�
				radamu =(int)(Math.random()*siyosya)+1; //***�p�G������J1 �d��|�Q�����Y���1~1����***
				System.out.println(radamu);//���׽T�{
				System.out.printf("1�q�@�ӷs��(1 ~ %d):",siyosya);
				//�H�Ĥ@����J���Ƨ@���üƪ��̤j��
				siyosya = s.nextInt();
				//��J�s�q���� 
				i=2;
			}
			else if (siyosya!=radamu && i==2) {
				radamu =(int)(Math.random()*(radamukari-siyosya+1))+siyosya;
				//�H�ϥΪ̿�J���ƭȧ@���̤j�ȥh���ü�
				System.out.println(radamu);//���׽T�{
				System.out.printf("2�q�@�ӷs��(%d ~ %d) :",siyosya,radamukari);
				//�H�Ĥ@����J���Ƨ@���üƪ��̤j��
				siyosya = s.nextInt();
				//��J�s�q����
				i=1;
			}
			else {
				kotae="�q���o";
				break;
			}
		}
		return kotae;
	}
}

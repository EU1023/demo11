package com.example.demo11;

public class Bank {
	//private �p����
	//����W�� �ᤩ branch �s���w�]�ȡA�Ӥ��O�{���w�]�Ȫ�null
	private String branch = "�x�W�Ȧ�";
	//�Τ�W��
	private String user;
	//�s�ھl�B
	private int balance;
	
	//�w�]�غc��k�A�榡: ��k���s���v�� ���O�W��(){}
	//				 public		Bank(){}
	//�w�]�غc��k --> �N�O�S���Ѽƪ��غc��k
	//�����O���S���إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	//���O�����إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc�k��N���A�O�w�]�غc��k�A�S�g�N����ϥ�
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	// �a���Ѽƪ��غc��k�A��@���e���P�� setXXX ��k�A��ڧ@�Φb���ֵ{���X�����
	public Bank(String branch,String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}
	
	//�إ��ݩʪ��s(get)��(set)��k
	//�p���ƴN�ݭn��get��set
	//�@���k:
	//�榡:��k���s���v�� ��k���^�ǭȪ���ƫ��A�A��k�W��(�Ѽƥi���i�L){��k����@ �{����@���e}
	//	  public	String			getBranch(){}
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//�s��
	public void saving(int maniin) {
		System.out.println("�`�B��: "+balance);
		if (maniin >=0) { //�P�_�O�_������
			balance +=maniin;
		}
		else {System.out.println("�s�ڪ��B�����J�t�ƭ�");}
		
		System.out.println("�w�s�J: "+ maniin);
		System.out.println("�`�B��: "+balance);
	}
	
	//����
	public void withdraw(int maniout) {
		System.out.println("�`�B��: "+balance);
		
		if (maniout > balance) { //�P�_�O�_�j��s�ڪ��B
			System.out.println("���ണ���W�L�s�ڪ��B�A�l�B����");
		}
		else if(maniout < 0) {//�O�_��J�t��
			System.out.println("���ର�t��");
		}
		else {
			System.out.println("�w����: "+maniout);
			balance -= maniout;
		}
		
		System.out.println("�`�B��: "+balance);
	}
	/* �ư��k �Ҧ�if�������i�h�L�~�ണ�� �u�n�e�����䥢�ѴN�^��
		if (maniout > balance) { //�P�_�O�_�j��s�ڪ��B
			System.out.println("���ണ���W�L�s�ڪ��B�A�l�B����");
			rutun;
		}
		if(maniout < 0) {//�O�_��J�t��
			System.out.println("���ର�t��");
			rutun;
		}
		System.out.println("�w����: "+maniout);
		balance -= maniout;
		System.out.println("�`�B��: "+balance);
	 
	 */
	
	//==
		//����򥻸�ƫ��A����
		//������O���O�����}
		
	public String withdraw(String branch) {
		return ""; 
	}
	public int withdraw1(String branch) {
		return 5;
	}
	public Bank withdraw2(String branch) {
		return new Bank();
	}
	public void withdraw3(String title,String branch,String uesr,int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
	}
	public static void withdraw31(String title,String branch,String uesr,int balance) {
		System.out.println(branch);
		System.out.println(uesr);
		System.out.println(balance);
		return;
	}
	public void withdraw4(int balance,String ... title) {
		return;
	}
}

package com.example.demo11;

public class Bank2 extends PBshare {
	// private String id;

	// private String name;

	// �`��(�T�w���ܪ���): �ܼƦW�٥��j�g�A���P�^��r���Ω��u�걵
	public final int MAX_NUMBHR = 20;
	
	// �@�몺�ݩ��ܼơA�Τp�m�p�覡�R�W�ܼ�
	private String branchTitle;

	private int balance;

	private PBshare pb;

	public String getBranchTitle() {
		return branchTitle;
	}

	public void setBranchTitle(String branchTitle) {
		this.branchTitle = branchTitle;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

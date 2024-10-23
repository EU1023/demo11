package com.example.demo11;

public class Bank2 extends PBshare {
	// private String id;

	// private String name;

	// 常數(固定不變的數): 變數名稱全大寫，不同英文字間用底線串接
	public final int MAX_NUMBHR = 20;
	
	// 一般的屬性變數，用小駝峰方式命名變數
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

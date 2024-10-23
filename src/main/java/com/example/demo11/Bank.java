package com.example.demo11;

public class Bank {
	//private 私有化
	//分行名稱 賦予 branch 新的預設值，而不是程式預設值的null
	private String branch = "台灣銀行";
	//用戶名稱
	private String user;
	//存款餘額
	private int balance;
	
	//預設建構方法，格式: 方法的存取權限 類別名稱(){}
	//				 public		Bank(){}
	//預設建構方法 --> 就是沒有參數的建構方法
	//當類別中沒有建立帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	//類別中有建立帶有參數的建構方法時，沒有參數的建構法方就不再是預設建構方法，沒寫就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 帶有參數的建構方法，實作內容等同於 setXXX 方法，實際作用在於減少程式碼的行數
	public Bank(String branch,String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}
	
	//建立屬性的存(get)取(set)方法
	//私有化就需要有get跟set
	//一般方法:
	//格式:方法的存取權限 方法的回傳值的資料型態，方法名稱(參數可有可無){方法的實作 程式實作內容}
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
	
	//存款
	public void saving(int maniin) {
		System.out.println("總額為: "+balance);
		if (maniin >=0) { //判斷是否為正數
			balance +=maniin;
		}
		else {System.out.println("存款金額不能輸入負數值");}
		
		System.out.println("已存入: "+ maniin);
		System.out.println("總額為: "+balance);
	}
	
	//提款
	public void withdraw(int maniout) {
		System.out.println("總額為: "+balance);
		
		if (maniout > balance) { //判斷是否大於存款金額
			System.out.println("不能提取超過存款金額，餘額不足");
		}
		else if(maniout < 0) {//是否輸入負數
			System.out.println("不能為負數");
		}
		else {
			System.out.println("已提取: "+maniout);
			balance -= maniout;
		}
		
		System.out.println("總額為: "+balance);
	}
	/* 排除法 所有if都必須進去過才能提款 只要前面哪邊失敗就回傳
		if (maniout > balance) { //判斷是否大於存款金額
			System.out.println("不能提取超過存款金額，餘額不足");
			rutun;
		}
		if(maniout < 0) {//是否輸入負數
			System.out.println("不能為負數");
			rutun;
		}
		System.out.println("已提取: "+maniout);
		balance -= maniout;
		System.out.println("總額為: "+balance);
	 
	 */
	
	//==
		//比較基本資料型態的值
		//比較類別的記憶體位址
		
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

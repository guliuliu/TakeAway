package com.tmxk.demo1;

public class GrandFather extends Person{
	//出生日期
	private String bornDate;

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	
	public GrandFather() {
		// TODO Auto-generated constructor stub
	}
	
	public GrandFather(String name) {
		super.setName(name);
	}

	public GrandFather(String name, int age, String sex, double height, String bornDate) {
		// 第一行代码就相当于以下三行
		super(name, age, sex, height);   // ① 
//		super.setName(name);			//②
//		super.setAge(age);				//③
//		super.setHeight(height);		//④
		this.bornDate = bornDate;
	}
	
	@Override
	public void eat(){
		System.out.println(super.getName() + "吃饭,一菜一汤");
	}
	
	public void onlinePay(){
		System.out.println("银行卡支付~~~");
	}
	
}

package com.tmxk.demo1;

public class Father extends Person {
	//工龄
	private int workYears;

	public int getWorkYears() {
		return workYears;
	}

	public void setWorkYears(int workYears) {
		this.workYears = workYears;
	}
	
	public Father() {
		// TODO Auto-generated constructor stub
	}

	public Father(String name){
		super.setName(name);
	}
	public Father(String name, int age, String sex, double height, int workYears) {
		super(name, age, sex, height);
		this.workYears = workYears;
	}
	
	public void eat(){
		System.out.println(super.getName() + "吃外卖,两菜一汤");
	}
	
	public void onlinePay(){
		System.out.println("微信支付~~~");
	}
}

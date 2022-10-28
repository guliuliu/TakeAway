package com.tmxk.demo1;

public class Father extends Person {
	//����
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
		System.out.println(super.getName() + "������,����һ��");
	}
	
	public void onlinePay(){
		System.out.println("΢��֧��~~~");
	}
}

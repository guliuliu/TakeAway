package com.tmxk.demo1;

public class GrandFather extends Person{
	//��������
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
		// ��һ�д�����൱����������
		super(name, age, sex, height);   // �� 
//		super.setName(name);			//��
//		super.setAge(age);				//��
//		super.setHeight(height);		//��
		this.bornDate = bornDate;
	}
	
	@Override
	public void eat(){
		System.out.println(super.getName() + "�Է�,һ��һ��");
	}
	
	public void onlinePay(){
		System.out.println("���п�֧��~~~");
	}
	
}

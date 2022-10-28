package com.tmxk.demo1;
/**
 * 定义了一个抽象的父类
 * @author Administrator
 *
 */
public abstract class Person {
	// 属性
	private String name;
	private int age;
	private String sex;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Person() {
	}
	public Person(String name, int age, String sex, double height) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	//定义一个抽象吃饭的方法
	public abstract void eat();
	
	//定义一个支付的方法
	public void onlinePay(){
		System.out.println("在线支付~~");
	}
	
}

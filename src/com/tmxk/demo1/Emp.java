package com.tmxk.demo1;

public class Emp extends Person{
	private String empNo;

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, int age, String sex, double height, String empNo) {
		super(name, age, sex, height);
		this.empNo = empNo;
	}
	
	public void eat(){
		System.out.println(super.getName() + "≥‘ ≥Ã√");
	}
	
	public void onlinePay(){
		System.out.println("À¢‘±π§ø®~~~");
	}
}

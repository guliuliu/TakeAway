package com.tmxk.demo2;

public class Sub extends Person{

	@Override
	public void company() {
		System.out.println("继承了父类的公司,躺平~~~");
	}

	@Override
	public void eat() {
		System.out.println("人要吃饭~~~");
	}
	
}

package com.tmxk.jiekou;
/**
 * 定义的自定义接口实现
 * @author Administrator
 *
 */
public class MyInterfaceImpl implements MyInterface,MyInter{

	@Override
	public void show() {
		System.out.println("show~~~");
	}

	@Override
	public void show1() {
		System.out.println("show1");
	}

	@Override
	public void show2() {
		System.out.println("show2");
	}

	@Override
	public void fly() {
		System.out.println("飞~~~");
	}

}

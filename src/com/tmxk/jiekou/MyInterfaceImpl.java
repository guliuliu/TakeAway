package com.tmxk.jiekou;
/**
 * ������Զ���ӿ�ʵ��
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
		System.out.println("��~~~");
	}

}

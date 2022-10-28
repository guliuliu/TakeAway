package com.tmxk.jiekou;

public class InterfaceTest {
	public static void main(String[] args){
		// 接口不能实例化,但可 实例化 实现该接口的实现类
		// 多态的体现 : 父类引用指向子类实例
		MyInter impl = new MyInterfaceImpl();
		impl.fly();
		
		MyInterface imp = new MyInterfaceImpl();
		imp.show();
	}
}

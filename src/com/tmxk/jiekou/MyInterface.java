package com.tmxk.jiekou;

public interface MyInterface {
	//接口中能定义的成员属性  是  静态常量,访问修饰符只能是 public
	//完整写法
	public static final java.lang.String myName = "";
	public String name1 = "";
	static String name2 = "";
	final String name3 = "";
	String name = "";
	
	//接口中能定义的成员 方法 是 抽象方法,访问修饰符只能是 public
	//完整写法
	public abstract void show();
	public void show1();
	void show2();
}

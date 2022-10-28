package com.tmxk.demo2;
/**
 * 抽象的Person父类
 * @author Administrator
 *
 */
public abstract class Person {
	String desc;
	//成员变量
	private String name;
	private int age;
	//快捷键:  Alt+Shift+S 
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
	
	//快捷键: Alt + /
	//无参构造
	public Person() {}
	//有参构造
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//定义一个普通方法(显示用户的基本信息)
	public void showInfo(){
		//输出语句
		System.out.println("[Person]姓名:"+this.name+"\t年龄:"+this.age);
	}
	
	//toString(): 将对象实例信息 通过String字符串显示
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//定义一个开公司的方法
	public abstract void company();
	
	public abstract void eat();
}






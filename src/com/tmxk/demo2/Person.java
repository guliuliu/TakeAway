package com.tmxk.demo2;
/**
 * �����Person����
 * @author Administrator
 *
 */
public abstract class Person {
	String desc;
	//��Ա����
	private String name;
	private int age;
	//��ݼ�:  Alt+Shift+S 
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
	
	//��ݼ�: Alt + /
	//�޲ι���
	public Person() {}
	//�вι���
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//����һ����ͨ����(��ʾ�û��Ļ�����Ϣ)
	public void showInfo(){
		//������
		System.out.println("[Person]����:"+this.name+"\t����:"+this.age);
	}
	
	//toString(): ������ʵ����Ϣ ͨ��String�ַ�����ʾ
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//����һ������˾�ķ���
	public abstract void company();
	
	public abstract void eat();
}






package com.tmxk.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		//Person p = new Person();
		Person person = new Son();
		Person person1 = new Father();
		
		try {
			//多态体现  父类引用指向子类实例对象
			InputStream in = new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//OutpuStream
	}

}

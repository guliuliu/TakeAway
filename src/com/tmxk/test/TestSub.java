package com.tmxk.test;


import org.junit.Test;

import com.tmxk.demo2.Person;
import com.tmxk.demo2.Sub;

public class TestSub {

	@Test
	public void test() {
		//实例化子类
		Person sub  = new Sub();
		sub.setName("小钱");
		System.out.println(sub.toString());
	}

}

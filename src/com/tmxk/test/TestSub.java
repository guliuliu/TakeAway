package com.tmxk.test;


import org.junit.Test;

import com.tmxk.demo2.Person;
import com.tmxk.demo2.Sub;

public class TestSub {

	@Test
	public void test() {
		//ʵ��������
		Person sub  = new Sub();
		sub.setName("СǮ");
		System.out.println(sub.toString());
	}

}

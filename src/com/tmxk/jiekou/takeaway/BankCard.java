package com.tmxk.jiekou.takeaway;
/**
 * ���п�ʵ����
 * @author Administrator
 *
 */
public class BankCard implements XxTakeAway{

	@Override
	public void onlinePay() {
		System.out.println("�������µ�,ʹ�����п�֧���ɹ�");
	}

	@Override
	public void onlinePay(String mes) {
		System.out.println("�������µ�" + mes);
	}

}

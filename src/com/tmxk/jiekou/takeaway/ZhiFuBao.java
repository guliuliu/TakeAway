package com.tmxk.jiekou.takeaway;
/**
 * ֧����ʵ����
 * @author Administrator
 *
 */
public class ZhiFuBao implements XxTakeAway{

	@Override
	public void onlinePay() {
		System.out.println("�������µ�,ʹ��֧����֧���ɹ�");
	}

	@Override
	public void onlinePay(String mes) {
		System.out.println("�������µ�,ʹ��" + mes);
	}

}

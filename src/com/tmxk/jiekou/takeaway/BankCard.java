package com.tmxk.jiekou.takeaway;
/**
 * 银行卡实现类
 * @author Administrator
 *
 */
public class BankCard implements XxTakeAway{

	@Override
	public void onlinePay() {
		System.out.println("外卖已下单,使用银行卡支付成功");
	}

	@Override
	public void onlinePay(String mes) {
		System.out.println("外卖已下单" + mes);
	}

}

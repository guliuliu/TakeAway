package com.tmxk.jiekou.takeaway;
/**
 * 支付宝实现类
 * @author Administrator
 *
 */
public class ZhiFuBao implements XxTakeAway{

	@Override
	public void onlinePay() {
		System.out.println("外卖已下单,使用支付宝支付成功");
	}

	@Override
	public void onlinePay(String mes) {
		System.out.println("外卖已下单,使用" + mes);
	}

}

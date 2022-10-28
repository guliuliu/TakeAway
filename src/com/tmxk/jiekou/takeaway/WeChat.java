package com.tmxk.jiekou.takeaway;
/**
 * 微信实现类
 * @author Administrator
 *
 */
public class WeChat implements XxTakeAway{

	@Override
	public void onlinePay() {
		System.out.println("外卖已下单,使用微信支付成功");
		
	}

	@Override
	public void onlinePay(String mes) {
		System.out.println("外卖已下单,使用" + mes);
	}

}

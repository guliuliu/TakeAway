package com.tmxk.jiekou.takeaway;
/**
 * 定义某某平台外卖接口
 * @author Administrator
 *
 */
public interface XxTakeAway {
	//方法重载
	//在线支付功能
	void onlinePay();
	
	void onlinePay(String mes);
}

package com.tmxk.jiekou.takeaway;
/**
 * 外卖业务类,实现各个不同支付平台支付方法
 * @author Administrator
 *
 */
public class TakeWaySys {
	
	/**
	 * 定义一个调用各个平台的支付方法
	 * @param away
	 */
//	public void payImplSys(XxTakeAway away){
//		away.onlinePay();
//	}
	
	/**
	 * 
	 * @param payType 支付类型
	 * @returna
	 */
	public void payImplSys(int payType){
		XxTakeAway away = null;
		if(payType == PayTypeEnum.ONE.getCode()){
			//new ZhiFuBao().onlinePay();
			away = new ZhiFuBao();
		}else if( payType == PayTypeEnum.TWO.getCode()){
			//new WeChat().onlinePay();
			away = new WeChat();
		}
		//away.onlinePay();
		away.onlinePay(PayTypeEnum.getValueByCode(payType));
	}
}








package com.tmxk.jiekou.takeaway;
/**
 * ����ҵ����,ʵ�ָ�����֧ͬ��ƽ̨֧������
 * @author Administrator
 *
 */
public class TakeWaySys {
	
	/**
	 * ����һ�����ø���ƽ̨��֧������
	 * @param away
	 */
//	public void payImplSys(XxTakeAway away){
//		away.onlinePay();
//	}
	
	/**
	 * 
	 * @param payType ֧������
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








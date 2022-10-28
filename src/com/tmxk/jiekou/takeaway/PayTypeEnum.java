package com.tmxk.jiekou.takeaway;
/**
 * 支付类型枚举
 * @author Administrator
 *
 */
public enum PayTypeEnum {
	//定义一组静态常量
	ONE(1,"AiPay"),TWO(2,"WeChat"),THREE(3,"BankCard");
	//ONE(1,"支付宝"),TWO(2,"微信"),THREE(3,"银行卡");
	//枚举可定义静态常量、私有的构造方法(只给本类自己使用的)、成员属性 、成员方法 、静态方法
	//定义两个成员属性
	private int code;
	private String value;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	//枚举的私有构造
	PayTypeEnum(int code,String val){
		this.code = code;
		this.value = val;
	}
	//定义静态方法
	/**
	 * 根据code数值获取对应的中文/英文参数
	 * @param code 参数数值  如( 1、2、3...)
	 * @return
	 */
	public static String getValueByCode(int code){
		switch(code){
		case 1:
			return PayTypeEnum.ONE.getValue();
		case 2:
			return PayTypeEnum.TWO.getValue();
		case 3:
			return PayTypeEnum.THREE.getValue();
		default:
			// "支付宝" 固定写死的数值,理解成 魔法值,魔法值在程序定义时不建议使用
			return PayTypeEnum.ONE.getValue();
		}
		
	}
}





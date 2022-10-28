package com.tmxk.jiekou.takeaway;
/**
 * ֧������ö��
 * @author Administrator
 *
 */
public enum PayTypeEnum {
	//����һ�龲̬����
	ONE(1,"AiPay"),TWO(2,"WeChat"),THREE(3,"BankCard");
	//ONE(1,"֧����"),TWO(2,"΢��"),THREE(3,"���п�");
	//ö�ٿɶ��徲̬������˽�еĹ��췽��(ֻ�������Լ�ʹ�õ�)����Ա���� ����Ա���� ����̬����
	//����������Ա����
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
	//ö�ٵ�˽�й���
	PayTypeEnum(int code,String val){
		this.code = code;
		this.value = val;
	}
	//���徲̬����
	/**
	 * ����code��ֵ��ȡ��Ӧ������/Ӣ�Ĳ���
	 * @param code ������ֵ  ��( 1��2��3...)
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
			// "֧����" �̶�д������ֵ,���� ħ��ֵ,ħ��ֵ�ڳ�����ʱ������ʹ��
			return PayTypeEnum.ONE.getValue();
		}
		
	}
}





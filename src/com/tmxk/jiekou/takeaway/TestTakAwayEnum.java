package com.tmxk.jiekou.takeaway;

import java.util.Scanner;

public class TestTakAwayEnum {
	public static void main(String[] args){
		//����Scanner�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("ʹ��ĳĳ�����µ�֧��");
		System.out.print("��ѡ��֧����ʽ 1.֧����  2.΢��  3.���п�");
		int chooseType = sc.nextInt();
		//�����ж�
		// ��Ԫ�����
		PayType pType = (chooseType == 1 ? PayType.֧���� : (chooseType == 2 ?  PayType.΢��  : PayType.���п� ));
		// ���֧����
		/*
		PayType pType1;
		if(chooseType == 1){
			pType1 = PayType.֧����;
		}else if(chooseType == 2){
			pType1 = PayType.΢��;
		}else{
			pType1 = PayType.���п�;
		}*/
		
		// switch(����){case 1: break;}    
		// ע: switch(�����������Ϳ���: byte short int long char String[String ��jdk1.8֮���������]��ö�� )
		XxTakeAway takeAway = null;
		switch(pType){
		case ֧����:
			takeAway = new ZhiFuBao();
			break;
		case ΢��:
			takeAway = new WeChat();
			break;
		case ���п�:
			takeAway = new BankCard();
			break;
		default:
			System.out.println("�븶Ǯ~~");
			break;
		}
		//����֧������
		takeAway.onlinePay();
	}
}

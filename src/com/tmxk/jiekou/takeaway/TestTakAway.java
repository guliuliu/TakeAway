package com.tmxk.jiekou.takeaway;

import java.util.Scanner;

public class TestTakAway {
	public static void main(String[] args){
		//����Scanner�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("ʹ��ĳĳ�����µ�֧��");
		System.out.print("��ѡ��֧����ʽ 1.֧����  2.΢��  3.���п�");
		int chooseType = sc.nextInt();
		// switch(����){case 1: break;}    
		// ע: switch(�����������Ϳ���: byte short int long char String[String ��jdk1.8֮���������]��ö�� )
		XxTakeAway takeAway = null;
		switch(chooseType){
		case 1:
			takeAway = new ZhiFuBao();
			break;
		case 2:
			takeAway = new WeChat();
			break;
		case 3:
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

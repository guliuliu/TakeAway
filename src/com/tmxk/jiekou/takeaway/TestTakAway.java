package com.tmxk.jiekou.takeaway;

import java.util.Scanner;

public class TestTakAway {
	public static void main(String[] args){
		//创建Scanner键盘输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("使用某某外卖下单支付");
		System.out.print("请选择支付方式 1.支付宝  2.微信  3.银行卡");
		int chooseType = sc.nextInt();
		// switch(条件){case 1: break;}    
		// 注: switch(条件数据类型可有: byte short int long char String[String 是jdk1.8之后提出来的]、枚举 )
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
			System.out.println("请付钱~~");
			break;
		}
		//调用支付功能
		takeAway.onlinePay();
	}
}

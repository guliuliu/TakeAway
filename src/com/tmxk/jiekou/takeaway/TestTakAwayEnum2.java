package com.tmxk.jiekou.takeaway;

import java.util.Scanner;

public class TestTakAwayEnum2 {
	public static void main(String[] args){
		//创建Scanner键盘输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("使用某某外卖下单支付");
		System.out.print("请选择支付方式 1."+ PayTypeEnum.ONE.getValue() +" 2."+PayTypeEnum.TWO.getValue()+"  3." + PayTypeEnum.THREE.getValue());
		int chooseType = sc.nextInt();
		//创建TakeWaySys业务类
		TakeWaySys sys = new TakeWaySys();
		sys.payImplSys(chooseType);
		
		
	}
}

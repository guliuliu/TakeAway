package com.tmxk.jiekou.takeaway;

import java.util.Scanner;

public class TestTakAwayEnum2 {
	public static void main(String[] args){
		//����Scanner�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("ʹ��ĳĳ�����µ�֧��");
		System.out.print("��ѡ��֧����ʽ 1."+ PayTypeEnum.ONE.getValue() +" 2."+PayTypeEnum.TWO.getValue()+"  3." + PayTypeEnum.THREE.getValue());
		int chooseType = sc.nextInt();
		//����TakeWaySysҵ����
		TakeWaySys sys = new TakeWaySys();
		sys.payImplSys(chooseType);
		
		
	}
}

package com.tmxk.jiekou;

public class InterfaceTest {
	public static void main(String[] args){
		// �ӿڲ���ʵ����,���� ʵ���� ʵ�ָýӿڵ�ʵ����
		// ��̬������ : ��������ָ������ʵ��
		MyInter impl = new MyInterfaceImpl();
		impl.fly();
		
		MyInterface imp = new MyInterfaceImpl();
		imp.show();
	}
}

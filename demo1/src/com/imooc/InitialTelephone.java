package com.imooc;

public class InitialTelephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ���޲����Ĺ��췽�����Դ�������
		Telephone phone = new Telephone();
		//ͨ���в����Ĺ��췽����������,���������е�ʵ����������ֵ
		Telephone phone2 = new Telephone(1.5f, 1.4f, 2.0f);
		//phone2.cpu=6.0f��ʱ�Ѿ������������ã���Ϊ���Ѿ���װ
		phone2.setScreen(6.0f);//���÷�װ����ֵ
		System.out.println("screen:"+phone2.getScreen());
	}

}
//���췽��ע��㣺
//1����û���ƶ����췽��ʱ��ϵͳ���Զ�����޲εĹ��췽����
//2�������ƶ����췽�����������вΡ��޲εĹ��췽�����������Զ�����޲εĹ��췽����
//3�����췽�������أ���������ͬ�����ǲ�����ͬ�Ķ�Ӵ������������ʱ���Զ����ݲ�ͬ�Ĳ���ѡ����Ӧ�ķ���
//4�����췽���������Ը���������Ը�ֵ�������Ա�֤����������Ը�һ�������ֵ��
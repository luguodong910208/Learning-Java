package com.imooc;

public class Telephone {
//	float screen;
//	float cpu;
//	float mem;
//Ϊ�˷�ֹ��ʹ�ù����У��û������ݵĸ��ģ������Ҫ�����ݵĽ��з�װ��
	private float screen;
	private float cpu;
	private float mem;
	
	public float getScreen() {//�õ���װ���е�screen��ֵ
		return screen;
	}
	
	public void setScreen(float newScreen) {//���÷�װ������screenֵ�����У�newScreenΪ������
		screen = newScreen;
	}
	
	public Telephone() {
		System.out.println("�޲����Ĺ��췽��ִ����");
	}
	public Telephone(float newScreen, float newCpu, float newMem) {
		if(newScreen < 3.5f) {
			System.out.println("���������Ļ�ߴ�̫С���Զ���ֵΪ3.5f");
			newScreen = 3.5f;
		}else {
			screen = newScreen;
		}
		
		cpu = newCpu;
		mem = newMem;
		System.out.println("�в����Ĺ��췽��ִ����");
	}
}

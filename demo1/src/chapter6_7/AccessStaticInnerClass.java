package chapter6_7;

public class AccessStaticInnerClass {
	static class StaticInnerClass{
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp() {
//		System.out.println(prop1);
//		���������ִ���Ӧ��Ϊ������ʽ
//		ͨ���������ʾ�̬�ڲ�������Ա
		System.out.println(StaticInnerClass.prop1);
//		System.out.println(prop2);
//		���������ִ���Ӧ��Ϊ������ʽ
//		ͨ��ʵ�����ʾ�̬�ڲ�������Ա
		System.out.println(new StaticInnerClass().prop2);
	}
}

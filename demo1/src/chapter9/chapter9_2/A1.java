package chapter9.chapter9_2;

public class A1 extends Apple<String>{
	//��ȷ��д�˸���ķ���������ֵ
	//�븸��Apple<String>����ֵ����ȫ��ͬ
	public String getInfo() {
		return "����"+super.getInfo();
	}
	/**
	 * ����ķ�������ִ���ԭ�����ڷ���ֵ���Ͳ�һ��
	 */
//	public Object getInfo() {
//		return "����";
//	}

}

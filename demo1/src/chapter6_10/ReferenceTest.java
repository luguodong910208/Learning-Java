package chapter6_10;

import java.lang.ref.WeakReference;

public class ReferenceTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//����һ���ַ�������
		String str = new String("����java����");
		//����һ�������ã��ô����������õ�str�ַ���
		WeakReference wr = new WeakReference(str);
		//�ж�str���ú�"���java����"�ַ���֮�������
		str = null;
		//ȡ�������������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());
	}

}

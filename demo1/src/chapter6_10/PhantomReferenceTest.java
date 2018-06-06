package chapter6_10;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//����һ���ַ�������
		String str = new String("���java����");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ�"���java����"�ַ���
		PhantomReference pr = new PhantomReference(str, rq);
		//�ж�str���ú�"���java����"�ַ���֮�������
		str = null;
		//ȡ�������������õĶ��󣬲�����ͨ�������û�ȡ�����õĶ������Դ˴����null
		System.out.println(pr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//��������֮�������ý������뵽���ö�����
		//ȡ�����ö��������Ƚ�����е�������pr���бȽ�
		System.out.println(rq.poll() == pr);
	}

}

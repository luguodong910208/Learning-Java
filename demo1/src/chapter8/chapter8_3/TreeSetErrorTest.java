package chapter8.chapter8_3;

import java.util.TreeSet;
import java.util.Date;


public class TreeSetErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		//��TreeSet�������������Ԫ��
		//����ӵڶ���Ԫ��ʱ������CompareTo(Object obj)ǿ�ƽ����ֶ���ת��Ϊͬһ�����ͽ��мƽ�
		//��������쳣
		//���ϣ��TreeSet�������У�����ֻ�����һ�����͵Ķ���
		ts.add(new String("���JAVA����"));
		ts.add(new Date());
		System.out.println(ts);
	}

}

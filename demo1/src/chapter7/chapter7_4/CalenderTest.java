package chapter7.chapter7_4;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(Calendar.YEAR));
		//ȡ���·�
		System.out.println(c.get(Calendar.MONTH));
		//ȡ������
		System.out.println(c.get(Calendar.DATE));
		//�ֱ������ꡢ�¡��ա�Сʱ�����ӡ���
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		//��Calendar����ǰ��8����
		c.roll(Calendar.MONTH, -8);
		System.out.println(c.getTime());
	}

}

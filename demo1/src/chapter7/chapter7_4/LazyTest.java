package chapter7.chapter7_4;

import java.util.Calendar;

public class LazyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2003, 7,31);
		//���·ݸ�Ϊ9������9��31�ղ�����
		//��������޸ģ�ϵͳ�����cal�Զ�����Ϊ10��1��
		cal.set(Calendar.MONTH, 8);
		//���潫�����10��1��
		System.out.println(cal.getTime());
//		����DATE�ֶ�Ϊ5
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}

}

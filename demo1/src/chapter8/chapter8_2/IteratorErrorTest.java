package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("���Android����")) {
				//ʹ��Iterator���������У������޸ļ���Ԫ��
				//����Ĵ���������쳣
				//Iterator���������ÿ���ʧ�ܻ���(fail-fast)
				//һ���������м�⵽�ü����Ѿ����޸�
				//������������ConcurrentModificationException�쳣
				//�������޸ĺ�Ľ��
				//����Ա��⹲����Դ������Ǳ������
				books.remove(book);
			}
		}
	}

}

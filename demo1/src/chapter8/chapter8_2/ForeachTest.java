package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		for(Object obj : books) {
			//�˴���book����Ҳ���Ǽ���Ԫ�ر���
			String book = (String)obj;
			System.out.println(book);
			if(book.equals("���Android����")) {
				//���潫����ConcurrentModificationException�쳣
				books.remove(book);
			}
		}
		System.out.println(books);
	}

}

package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		//����forEach()������������
		books.forEach(obj -> System.out.println("��������Ԫ�أ�"+obj));
	}

}

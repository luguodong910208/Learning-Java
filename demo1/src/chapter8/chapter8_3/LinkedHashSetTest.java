package chapter8.chapter8_3;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet books = new LinkedHashSet();
		books.add("���JAVA����");
		books.add("������JavaEE��ҵӦ��ʵս");
		System.out.println(books);
		//ɾ�� ���JAVA����
		books.remove("���JAVA����");
		//������ӷ��JAVA����
		books.add("���JAVA����");
		System.out.println(books);
	}

}

package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���IOS����");
		books.add("���Ajax����");
		books.add("���Android����");
		//ʹ��Lambda���ʽ(Ŀ��������Predicate)���˼���,��������ɾ��
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}

}

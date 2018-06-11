package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���IOS����");
		books.add("���Ajax����");
		books.add("���Android����");
		//ͳ����������������Ӵ���ͼ������
		System.out.println(calAll(books , ele -> ((String)ele).contains("���")));
		System.out.println(calAll(books, ele -> ((String)ele).contains("Java")));
		System.out.println(calAll(books, ele -> ((String)ele).length() >10));
	}
	public static int calAll(Collection books, Predicate p) {
		int total = 0;
		for(Object obj : books) {
			//ʹ��Predicate��test()�����жϸö����Ƿ�����Predicateָ��������
			if(p.test(obj)) {
				total ++;
			}
		}
		return total;
	}

}

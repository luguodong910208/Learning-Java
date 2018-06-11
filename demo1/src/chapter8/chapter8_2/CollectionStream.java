package chapter8.chapter8_2;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ������
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���IOS����");
		books.add("���Ajax����");
		books.add("���Android����");
		//ͳ����������"���"�Ӵ���ͼ������
		System.out.println(books.stream().filter(ele -> ((String)ele).contains("���")).count());
		//ͳ����������"Java"�Ӵ���ͼ������
		System.out.println(books.stream().filter(ele -> ((String)ele).contains("Java")).count());
		//ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream().filter(ele -> ((String)ele).length()>10).count());
		//�ȵ���Collection�����stream()����������ת��ΪStream
		//�ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		books.stream().mapToInt(ele -> ((String)ele).length())
		//����forEach()��������IntStream��ÿ��Ԫ��
		.forEach(System.out::println);
	}

}

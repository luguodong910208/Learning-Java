package chapter8.chapter8_4;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;


public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("������JAVA EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���ANDROID����"));
		System.out.println(books);
		//���뵽�ڶ���λ��
		books.add(1, new String("���AJAX����"));
		for(int i=0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//ɾ��������Ԫ��
		books.remove(2);
		System.out.println(books);
		//�ж��ö�Ԫ���ڼ����е�λ��
		System.out.println(books.indexOf(new String("���java����")));
		//�滻�ڶ���Ԫ��
		books.set(1, new String("���JAVA����"));
		System.out.println(books);
		//��ȡ���ڵ��ڵڶ���Ԫ�ص�С�ڵ��ڵ�����Ԫ�ص��Ӽ�
		System.out.println(books.subList(1,2));
	}

}

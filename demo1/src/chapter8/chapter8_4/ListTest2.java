package chapter8.chapter8_4;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

class A{
	public boolean equals(Object obj) {
		return true;
	}
}

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add(new String("������JAVA EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���ANDROID����"));
		System.out.println(books);
		//ɾ�������е�A���󣬽�����һ�ظ�Ԫ�ر�ɾ��
		books.remove(new A());
		System.out.println(books);
		books.remove(new A());
		System.out.println(books);
	}

}

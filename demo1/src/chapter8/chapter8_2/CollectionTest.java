package chapter8.chapter8_2;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("�����");
		//��Ȼ�������治�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ�����"+c.contains("�����"));
		c.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		Collection books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�"+c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		//ɾ��c�����������Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		//����books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�"+books);
	}

}

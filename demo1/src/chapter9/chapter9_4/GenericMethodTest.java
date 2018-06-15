package chapter9.chapter9_4;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
	//����һ�����ͷ������÷��ͷ�����һ��T�����β�
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for(T o : a) {
			c.add(o);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		//���������T����Object����
		fromArrayToCollection(oa, co);
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		//��������е�T������String����
		fromArrayToCollection(sa, cs);
	}

}

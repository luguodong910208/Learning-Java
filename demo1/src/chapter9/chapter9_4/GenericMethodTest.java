package chapter9.chapter9_4;

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

	}

}

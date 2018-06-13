package chapter8.chapter8_6;

import java.util.Hashtable;

class A{
	int count;
	public A(int count) {
		this.count = count;
	}
	//����count��ֵ���ж����������Ƿ����
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj != null && obj.getClass() == A.class) {
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	//����count������hashCode��ֵ
	public int hashCode() {
		return this.count;
	}
}

class B{
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		ht.put(new A(6000), "���java����");
		ht.put(new A(87563), "������JAVA EE��ҵӦ��ʵս");
		ht.put(new A(1232), new B());
		System.out.println(ht);
		System.out.println(ht.containsValue("�����ַ���"));
		System.out.println(ht.containsKey(new A(87563)));
		ht.remove(new A(1232));
		System.out.println(ht);
	}

}

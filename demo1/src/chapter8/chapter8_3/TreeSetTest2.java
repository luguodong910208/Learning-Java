package chapter8.chapter8_3;

import java.util.TreeSet;

class Z implements Comparable{
	int age;
	public Z(int age) {
		this.age = age;
	}
	//��дequals()���������Ƿ���true
	public boolean equals(Object obj) {
		return true;
	}
	//��дcomparableTo(Object obj)���������Ƿ���1
	public int compareTo(Object obj) {
		return 1;
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//�ڶ������ͬ����Ԫ��,���Ϊtrue��������ӳɹ�
		System.out.println(set.add(z1));
		System.out.println(set);
		//�޸�set���ϵĵ�һ��Ԫ�ص�age����
		((Z)(set.first())).age = 9;
		//��ʱ����Ԫ�ؾ�Ϊ9��ԭ�������ڼ����У�����ʱ��Ϊͬһ��Ԫ�ؽ��д洢�����һ�𱻸���
		System.out.println(((Z)(set.last())).age);
	}

}

package chapter8.chapter8_3;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet nums = new TreeSet();
		//��TreeSet����ĸ�Integer����
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		//�������Ԫ�أ����������Ѿ���������״̬
		System.out.println(nums);
		//�����һ��Ԫ��,���һ��Ԫ��,С��4��Ԫ�أ����ڵ���5��Ԫ�أ����ڵ���-3С��4���Ӽ�
		System.out.println(nums.first());
		System.out.println(nums.last());
		System.out.println(nums.headSet(4));
		System.out.println(nums.tailSet(5));
		System.out.println(nums.subSet(-3, 4));
	}

}

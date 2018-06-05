package chapter6_8;

import java.util.Arrays;

public class LambdaArrays {
	public static void main(String[] args) {
		String[] arr1 = new String[] {"java","fkava","fkit","ios","android"};
		Arrays.parallelSort(arr1,(o1, o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {3,-4,35,25,30,18};
		//left����������ǰһ����������Ԫ�أ������һ��Ԫ��ʱ��leftΪ1
		//right�������鵱ǰ��������Ԫ��
		Arrays.parallelPrefix(arr2, (left, right) -> left*right);
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
		//operand�������ڼ����Ԫ������
		Arrays.parallelSetAll(arr3, operand -> operand*5);
		System.out.println(Arrays.toString(arr3));
	}
}

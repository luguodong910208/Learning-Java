package practise50;
/**
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�
 * ������������ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
 * ��˹���Ϊ��a[n]=a[n-1]+a[n-1]
 */

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.print("����������֪���������������·�:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//��ȡ���������
		System.out.println("��"+n+"�������ӵ�����Ϊ:"+fun(n));
		scanner.close();
	}
	private static int fun(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fun(n-1)+fun(n-2);
		}
	}
}

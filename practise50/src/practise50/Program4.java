package practise50;
/**
 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 * �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
 * (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
 * (2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ����
 * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
 */

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.print("������һ��������");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println();
		System.out.print(input+"=");
		for(int i=2; i<input+1; i++) {
			while(input % i ==0 && input!=i) {
				input = input / i;
				System.out.print(i+"*");
			}
			if(input == i) {
				System.out.print(i);
				break;
			}
		}
		scanner.close();
	}

}

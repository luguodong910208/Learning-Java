package practise50;

import java.util.Scanner;

/**
 * ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 * ���������(a>b)?a:b��������������Ļ������ӡ�
 * @author lu
 *
 */
public class Program5 {

	public static void main(String[] args) {
		System.out.println("���������ķ���");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String belong = input>=90?"A":(input>=60?"B":"C");
		System.out.println(input+"������:"+belong);
		scanner.close();
	}

}

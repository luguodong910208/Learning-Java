package chapter7_1;

import java.util.Scanner;

public class ScannerLongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in�����������
		Scanner sc = new Scanner(System.in);
		//�ж��Ƿ�����һ��long������
		while (sc.hasNextLong()) {
			System.out.println("��������������ǣ�"+sc.nextLong());
		}
	}

}

package chapter7_1;

import java.util.Scanner;

public class ScannerKeyBoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in�����׼���룬���Ǽ�������
		Scanner sc = new Scanner(System.in);
		//��������һ�н�ֻ�ܻس���Ϊ�ָ���
//		sc.useDelimiter("\n");
//		�ж��Ƿ�����һ��������
		while (sc.hasNext()) {
//			���������
			System.out.println("��������������ǣ�"+sc.next());
		}
	}

}

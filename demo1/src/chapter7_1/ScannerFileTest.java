package chapter7_1;

import java.util.Scanner;
import java.io.File;

public class ScannerFileTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//��һ��File������ΪScanner�Ĺ�����������Scanner��ȡ�ļ�����
		Scanner sc = new Scanner(new File("ScannerLongTest.java"));
		System.out.println("ScannerFileTest.java�ļ��������£�");
		//�ж��Ƿ�����һ��
		while(sc.hasNextLine()) {
			//����ļ�����һ��
			System.out.println(sc.nextLine());
		}
	}

}

package chapter10.chapter10_2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoClose {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try (
			//��������ʼ�������ɹرյ���Դ
			//try�����Զ��ر���������Դ
			BufferedReader br = new BufferedReader(new FileReader("AutoClose.java"));
			PrintStream ps = new PrintStream(new FileOutputStream("a.txt"))
		){
			//ʹ��������Դ
			System.out.println(br.readLine());
			ps.println("ׯ�������Ժ���");
		}
	}

}

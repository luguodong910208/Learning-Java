package chapter9.chapter9_1;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;

public class ListErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ֻ�뱣��String���͵�List����
		List strList = new ArrayList();
		strList.add("Math");
		strList.add("English");
		//�����Integer����Ԫ�ط���,�ͻ���Ϊǿ��ת��Ϊ�ַ������ͱ���
		strList.add(5);
		strList.forEach(str -> System.out.println(((String)str).length()));
	}

}

package chapter8.chapter8_4;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List fixedList = Arrays.asList("���java����","������JAVA EE��ҵӦ��ʵս");
		System.out.println(fixedList.getClass());
		//������ӡ
		fixedList.forEach(System.out::println);
		//��ͼ���ӻ���ɾ��Ԫ�ض��������쳣
		fixedList.add("���ANDROID����");
		fixedList.add("���IOS����");
	}

}

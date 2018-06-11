package chapter8.chapter8_2;

import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.builder()
				.add(20)
				.add(13)
				.add(-2)
				.add(18)
				.build();
		//������þۼ������Ĵ���ÿ��ֻ��ִ��һ��
		System.out.println("is����Ԫ�ص����ֵ��"+is.max().getAsInt());
		System.out.println("is����Ԫ�ص���Сֵ��"+is.min().getAsInt());
		System.out.println("is����Ԫ�ص��ܺͣ�"+is.sum());
		System.out.println("is����Ԫ�ص�������"+is.count());
		System.out.println("is����Ԫ�ص�ƽ��ֵ��"+is.average());
		System.out.println("is����Ԫ�ص�ƽ���Ƿ񶼴���20��"+is.allMatch(ele -> ele*ele > 20));
		System.out.println("is�Ƿ�����κ�Ԫ�ص�ƽ��������20��"+is.anyMatch(ele -> ele*ele>20));
		//��isӳ���һ���µ�Stream���µ�Streamÿ��Ԫ����ԭStreamԪ�ص�������1
		IntStream newIs = is.map(ele -> ele*2+1);
		//ʹ�÷������õķ�ʽ��������Ԫ��
		newIs.forEach(System.out::println);
	}

}

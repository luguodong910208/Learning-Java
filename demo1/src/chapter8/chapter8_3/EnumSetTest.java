package chapter8.chapter8_3;

import java.util.EnumSet;

enum Season{
	SPRING,SUMMER,FALL,WINTER
}

public class EnumSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet es1 = EnumSet.allOf(Season.class);//ö��
		System.out.println(es1);
		//����һ���ռ��ϣ�ָ���伸��Ԫ����Season���ö��ֵ
		EnumSet es2 = EnumSet.noneOf(Season.class);
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//�´�����EnumSet����Ԫ�غ�es4������ͬ������
		//es5����Ԫ��+es4�ļ���Ԫ��ΪSeasonö�����ȫ��ö��ֵ
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}

}

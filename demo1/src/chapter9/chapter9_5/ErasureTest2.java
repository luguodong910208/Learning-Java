package chapter9.chapter9_5;

import java.util.List;
import java.util.ArrayList;

public class ErasureTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(6);
		li.add(9);
		List list = li;
		//�����������δ������ת�������棬���롢����ʱ��ȫ����
		List<String> ls = list;
		//��ֻҪ����ls���Ԫ�أ��ͻ������쳣
//		System.out.println(ls.get(0));
	}

}

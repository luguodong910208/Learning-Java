package chapter9.chapter9_4;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class MyUtils {
	//����dest����Ԫ�ص����ͱ�����src����Ԫ�ص�������ͬ���������丸��
	public static <T> T Copy(Collection<? super T> dest, Collection<T> src) {
		T last = null;
		for(T ele : src) {
			last = ele;
			dest.add(ele);
		}
		return last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		//�˴���׼ȷ��֪�����һ�������Ƶ�Ԫ��ʱInteger����
		//��src����Ԫ�ص�������ͬ
		Integer last = Copy(ln, li);
		System.out.println(ln);
		
	}

}

package chapter8.chapter8_3;

import java.util.HashSet;
import java.util.Iterator;

class R{
	int count;
	public R(int count) {
		this.count = count;
	}
	public String toString() {
		return "R[count:"+count+"]";
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode() {
		return this.count;
	}
}
public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//��ӡHashSet���ϣ�����Ԫ��û���ظ�
		System.out.println(hs);
		//ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//Ϊ��һ��Ԫ�ص�countʵ��������ֵ
		first.count = -3;
		//�ٴ����HashSet���ϣ�����Ԫ�����ظ�Ԫ��
		System.out.println(hs);
		//ɾ��countΪ-3��R����
		hs.remove(new R(-3));
		//���Կ�����ɾ����һ��RԪ��
		System.out.println(hs);
		System.out.println("hs�Ƿ����countΪ-3��R����"+hs.contains(new R(-3)));
		System.out.println("hs�Ƿ����countΪ-2��R����"+hs.contains(new R(-2)));
	}

}

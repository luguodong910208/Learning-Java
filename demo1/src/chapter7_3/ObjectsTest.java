package chapter7_3;

import java.util.Objects;

public class ObjectsTest {
	//����һ��obj������Ĭ��ֵΪnull
	static ObjectsTest obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���һ��null�����hashCodeֵ�����Ϊ0
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toString�����Ϊnull
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull�����objΪnull�������쳣
		System.out.println(Objects.requireNonNull(obj, "obj��������ΪNull"));
	}

}

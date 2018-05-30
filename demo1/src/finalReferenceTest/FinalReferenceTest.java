package finalReferenceTest;

import java.util.Arrays;

class Person{
	private int age;
	public Person() {};
	public Person(int age) {
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args) {
		//final�������������iArr��һ�����ñ���
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		//������������򣬺Ϸ�
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//������Ԫ�ظ�ֵ���Ϸ�
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//��������iArr���¸�ֵ���Ƿ�
		//iArr = null;
		//final����Person������p��һ�����ñ���
		final Person p = new Person(45);
		//�ı�Person�����ageʵ���������Ϸ�
		p.setAge(23);
		System.out.println(p.getAge());
		//��������p���¸�ֵ���Ƿ�
		// p = null;
	}
}

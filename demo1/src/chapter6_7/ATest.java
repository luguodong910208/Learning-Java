package chapter6_7;
interface A{
	void test();
}
public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		A a = new A() {
			public void test() {
				//��java8��ǰһ�������ʾ����age����ʹ��final����
				//��java8��ʼ�������ڲ��ࡢ�ֲ��ڲ���������ʷ�final�ľֲ�����
				System.out.println(age);
			}
		};
		a.test();
	}

}

package person;

public class Person {
	//���涨��һ����ʼ����
	{
		int a=6;
		if(a > 4) {
			System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	//����ڶ�����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	//�����޲����Ĺ�����
	public Person() {
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args) {
		new Person();
	}
}

package chapter6_8;
@FunctionalInterface
interface Displayable{
	//����һ�����󷽷���Ĭ�Ϸ���
	void display();
	default int add(int a, int b) {
		return a+b;
	}
}
public class LambdaAndInner {
	private int age = 20;
	private static String name = "��������������";
	public void test() {
		String book = "���java����";
		Displayable dis = ()->{
			//���ʡ�effectively final���ľֲ�����
			System.out.println("book�ֲ�����Ϊ��"+book);
			//�����ⲿ���ʵ�������������
			System.out.println("�ⲿ���ageʵ������Ϊ��"+age);
			System.out.println("�ⲿ���name�����Ϊ��"+name);
		};
		dis.display();
		//����dis����ӽӿ��м̳е�add()����
		System.out.println(dis.add(3, 5));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}

}

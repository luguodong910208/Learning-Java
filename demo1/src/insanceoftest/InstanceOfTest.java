package insanceoftest;

public class InstanceOfTest {
	public static void main(String[] args) {
		//����helloʱʹ��Object�࣬��hello�ı���������Object
		//Object��������ĸ��࣬��hello������ʵ�����͵�String
		Object hello = "Hello";
		System.out.println("�ַ����Ƿ���Object���ʵ����"
				+(hello instanceof Object));
		System.out.println("�ַ����Ƿ���String���ʵ����"
				+(hello instanceof String));
		System.out.println("�ַ����Ƿ���Math���ʵ����"
				+(hello instanceof Math));
		//Stringʵ����Comparable�ӿ�
		System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����"
				+(hello instanceof Comparable));
	}
}

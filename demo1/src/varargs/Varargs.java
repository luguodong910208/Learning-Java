package varargs;

public class Varargs {
	/**
	 * ���ÿɱ��βΣ���������������ʱ�����ù����в�����ͨ��ֱ�Ӵ���һ���ַ���������ֻ�ܴ����β��б�����Ҳ����˵��
	 * һ��������ֻ����һ�����ȿɱ���βΡ���˽�����������β���ʽ
	public static void test(int a, String... books) {
		for(String book:books) {
			System.out.println(book);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		test(5,"���ҵ�java����","������java");
	}
	**/
	//���������βΣ�����ʱ���봫��һ�����飬����������ַ�ʽ
	public static void test(int a, String[] books) {
		for(String book:books) {
			System.out.println(book);
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		test(5, new String[] {"���ҵ�java����","������java"});
	}
}

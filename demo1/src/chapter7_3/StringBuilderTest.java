package chapter7_3;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		//׷���ַ���,sb="java"
		sb.append("java");
		//����,sb = "Hello java"
		sb.insert(0, "Hello");
		//�滻,sb = "Hello, java"
		sb.replace(5, 6, ",");
		//ɾ����sb = "Hellojava"
		sb.delete(5, 6);
		System.out.println(sb);
		//��ת
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//�ı�StringBuilder�ĳ��ȣ���ֻ����ǰ�沿��
		sb.setLength(5);
		System.out.println(sb);
	}

}

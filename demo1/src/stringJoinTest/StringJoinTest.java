package stringJoinTest;

public class StringJoinTest {
	public static void main(String[] args) {
		String s1 = "���Java";
		String s2 = "���" + "Java";
		String s4 = "Java";
		String s5 = "���";
		System.out.println(s1 == s2);
		String s3 = s5 + s4;
		System.out.println(s1 == s3);
		final String str1 = "���";
		final String str2 = "Java";
		String str3 = str1 + str2;
		System.out.println(s1 == str3);
	}
}
//s2��ֵ�������ַ���ֱ�ӽ����������㣬�������ڱ���׶ξ�ȷ��s2��ֵ��s1��ֵ��ָ��һ��;
//s3��s4��s5�����������㣬����s1��s2������ͨ����������������ִ�С����滻��,
//��˱������޷�ȷ��s3��ֵ���޷�ָ���ַ�����
//str1��sr=tr2�ǡ����滻����str3���ڱ�������ȷ��str3��ָ��
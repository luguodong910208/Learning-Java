package chapter7_2;

public class IdentifyHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������е�s1��s2��������ͬ�Ķ���
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String��д��hashCode()����
		//��Ϊ�����ַ����м���hashCodeֵ
		//��Ϊs1��s2���ַ�������һֱ���������ǵ�hashCode()��������ֵһ��
		System.out.println(s1.hashCode()+"----"+s2.hashCode());
		//s1��s2�ǲ�ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1)+"----"+System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		//s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3)+"----"+System.identityHashCode(s4));
	}

}

package Lee;

public class OutputFieldTest {
	public static void main(String[] args) {
		//������һ�����е�Output�ӿڵ�MAX_CACHE_LINE
		System.out.println(Lee.Output.MAX_CACHE_LINE);
		//������佫������Ϊfinal������ֵ���ı����쳣
		//lee.Output.MAX_CACHE_LINE = 20;
		//ʹ�ýӿ��������෽��
		System.out.println(Lee.Output.staticTest());
	}
}

package chapter6_8;
@FunctionalInterface
interface Converter{
	Integer convert(String from);
}
//public class MethodRefer{
//	//�������ʹ��Lambda���ʽ����Converter����
//	Converter converter1 = from -> Integer.valueOf(from);
//	Integer val = converter1.convert("99");
//	System.out.println(val);//�������99
//	//�������ô���Lambda���ʽ�������෽��
//	//����ʽ�ӿ��б�ʵ�ַ�����ȫ�������������෽����Ϊ����
//	Converter converter1 = Integer::valueOf;
//
//}
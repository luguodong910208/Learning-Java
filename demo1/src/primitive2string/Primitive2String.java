package primitive2string;

public class Primitive2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intStr="123";
		//��һ���ض��ַ���ת��Ϊint����
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it2);
		String floatStr = "4.56";
		//��һ���ض��ַ���ת��Ϊfloat����
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);
		//��һ��float����ת��ΪString����
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		//��һ��double����ת��ΪString����
		String dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		//��һ��boolean����ת��ΪString����
		String boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}

}

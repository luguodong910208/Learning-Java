package chapter16Annotation.chapter16_2.c2;

class Demo{
	@Deprecated
	public String getInfo() {
		return "����һ��Person��";
	}
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		System.out.println(d.getInfo());
	}

}

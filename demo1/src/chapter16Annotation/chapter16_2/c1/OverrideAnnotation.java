package chapter16Annotation.chapter16_2.c1;
class Person{
	public String getInfo() {
		return "����һ��Person��";
	}
}

class Student extends Person{
	@Override
	public String getInfo() {
		return "����һ��Student��";
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Student();
		System.out.println(per.getInfo());
	}

}

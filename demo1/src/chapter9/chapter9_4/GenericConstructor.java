package chapter9.chapter9_4;

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}

public class GenericConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo("����Java����");
		new Foo(200);
		new <String> Foo("���Android����");//�ƶ�T����ΪString����
//		new <String> Foo(12.3);�����Դ���Double����,����String���ͣ���˱���
	}
}

package chapter9.chapter9_4;

class Myclass<E>{
	public <T> Myclass(T t){
		System.out.println("t������ֵΪ��"+t);
	}
}

public class GenericDiamondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Myclass�������е�E�β�ΪString����
		//���͹�������������T�β�ΪInteget����
		Myclass<String> mc1 = new Myclass<>(5);
		//��ʾָ�����͹�������������T�β���Integer����
		Myclass<String> mc2 = new <Integer> Myclass<String>(5);
		//Myclass�������е�E�β���String����
		//�����ʽ�ƶ����͹�������������T�β���Integer����
		//��ʱ�Ͳ���ʹ�á����Ρ��﷨�������﷨�ͻ���ִ���
//		Myclass<String> mc3 = new <Integer> Myclass<>(5);
	}

}

package chapter7_2;

public class RuntimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡjava�������������ʱ����
		Runtime rt = Runtime.getRuntime();
		System.out.println("������������"+rt.availableProcessors());
		System.out.println("�����ڴ�����"+rt.freeMemory());
		System.out.println("���ڴ�����"+rt.totalMemory());
		System.out.println("��������ڴ�����"+rt.maxMemory());
	}

}

package chapter6_10;

public class FinalizeTest {
	private static FinalizeTest ft = null;
	public void info() {
		System.out.println("������Դ�����finalize����");
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//����FinalizeTest����������������ɻָ�״̬
		new FinalizeTest();
		//֪ͨϵͳ������Դ����
		System.gc();
		//ǿ���������ջ��Ƶ��ÿɻָ������finalize()����
//		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		//�ٴε���ft�����info()����
		ft.info();
	}
	public void finalize() {
		//��ft���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�
		ft = this;
	}

}

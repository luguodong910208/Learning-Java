//����������ϰ
package overload;

public class Overload {
	public void test() {
		System.out.println("�޲���");
	}
	public void test(String msg) {
		System.out.println("ֻ��һ��������test����");
	}
	public void test(String... books) {
		System.out.println("***�βθ����ɱ��test����***");
	}
	public static void main(String[] args) {
		Overload olv = new Overload();
		//������޲�����test����ֱ��ȥ�����������������������βθ����ɱ�����ؽ���ִ��
		olv.test();
		olv.test("aa","bb");
		//����ִ��һ��������test����
		olv.test("aa");
		//����ִ���βθ����ɱ��test����
		olv.test(new String[] {"aa"});
	}
}

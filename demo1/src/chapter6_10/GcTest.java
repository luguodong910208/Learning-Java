package chapter6_10;

public class GcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			new GcTest();
		}
	}
	public void finalize() {
		System.out.println("ϵͳ��������GcTest�������Դ...");
	}

}
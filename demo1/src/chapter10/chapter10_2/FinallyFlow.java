package chapter10.chapter10_2;

public class FinallyFlow {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean a = test();
		System.out.println(a);
	}
	public static boolean test() {
		try {
			//��Ϊfinally���а�����return���
			//���������return���ʧȥ����
			return true;
		}
		finally {
			return false;
		}
	}

}

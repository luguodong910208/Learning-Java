package chapter10.chapter10_2;

public class MultiExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("�����������������Ľ���ǣ�"+c);
		}
		catch(IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie) {
			System.out.println("������������Խ�硢���ָ�ʽ�쳣�������쳣֮һ");
//			ie = new ArithmeticException("test");
		}
		catch(Exception e) {
			System.out.println("δ֪�쳣");
			e = new RuntimeException("test");
		}
	}

}

package chapter10.chapter10_5;

class SelfException extends RuntimeException{
	SelfException(){};
	SelfException(String msg){
		super(msg);
	}
}

public class PrintStackTraceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();
	}
	public static void firstMethod() {
		secondMethod();
	}
	public static void secondMethod() {
		thirdMethod();
	}
	public static void thirdMethod() {
		throw new SelfException("�Զ����쳣��Ϣ");
	}

}

package chapter10.chapter10_4;

public class SalException extends Exception{
	public SalException() {};
	public SalException(String msg) {
		super(msg);
	}
	//�������Խ���Throwable�����Ĺ�����
	public SalException(Throwable t) {
		super(t);
	}
}

package chapter6_7;

public class SubClass extends Out.In{
	//��ʾ����SubClass�Ĺ�����
	public SubClass(Out out) {
		//ͨ�������Out������ʾ����In�Ĺ�����
		out.super("hello");
	}
}

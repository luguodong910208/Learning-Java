package interview_questions_02;

public class Method1 {
//ʵ��singletonģʽ
	//����ģʽ
	private static Method1 instance = new Method1();//������̬����
	private Method1() {};//����˽�еĹ�����
	private static Method1 getInstance(){
		return instance;
	}
}

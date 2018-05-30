package singletonTest;
class Singleton{
	//ʹ��һ�����������������������ʵ��
	private static Singleton instance;
	//�Թ�����ʹ��private���Σ����ظù�����
	private Singleton() {}
	//�ṩһ����̬���������ڷ���Singletonʵ��
	//�÷������Լ����Զ�����ƣ���ֻ֤����һ��Singleton����
	public static Singleton getInstance() {
		//���instanceΪnull���������û�д���Singleton����
		//���Instance��λnull��˵���Ѿ������˶��󣬽����ᴴ���µ�ʵ��
		if(instance == null) {
			//����һ�����󣬲����仺������
			instance = new Singleton();
		}
		return instance;
	}
}
public class SingletonTest {
	public static void main(String[] args) {
		//����Singleton������ͨ��������
		//ֻ��ͨ��getInstance�������õ�ʵ��
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
	}
}

package Lee;

public interface Output {
	//�ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 50;
	//�ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	void out();
	void getData(String msg);
	//�ڽӿ��ﶨ��Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}
	//�ڽӿڶ���Ĭ�Ϸ�������Ҫʹ��default����
	default void test() {
		System.out.println("Ĭ�ϵ�test()����");
	}
	//�ڽӿڶ�����ķ�������Ҫʹ��static����
	static String staticTest() {
		return "�ӿ�����෽��";
	}
}

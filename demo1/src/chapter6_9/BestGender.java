package chapter6_9;

public enum BestGender {
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
	MALE("��"),FEMALE("Ů");
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private BestGender(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}

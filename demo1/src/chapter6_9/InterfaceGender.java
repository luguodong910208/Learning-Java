package chapter6_9;

public enum InterfaceGender implements GenderDesc{
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
		MALE("��"),FEMALE("Ů");
		private final String name;
		//ö����Ĺ�����ֻ��ʹ��private����
		private InterfaceGender(String name) {
			this.name=name;
		}
		public String getName() {
			return this.name;
		}
		public void info() {
			System.out.println("����һ�����ڶ����Ա��ö����");
		}
}

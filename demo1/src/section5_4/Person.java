package section5_4;

public class Person {
	//ʹ��private���γ�Ա����������Щ��Ա������������
	private String name;
	private int age;
	public void setName(String name) {
		//ִ�к����Լ��飬Ҫ���û�����2-6λ֮��
		if(name.length() > 10 || name.length() < 2) {
			System.out.println("�����õ�����������Ҫ��");
		} else {
			this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		if(age > 100 || age <0 ) {
			System.out.println("�����õ����䲻�Ϸ�");
		} else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
}

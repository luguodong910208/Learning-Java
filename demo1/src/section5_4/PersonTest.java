package section5_4;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		//����age��name���Զ���private���ԣ���˱���ʹ�÷������
		p.setAge(27);
		p.setName("Winston");
		System.out.println("��ӭ����"+p.getName()+"��������������Ϊ��"+p.getAge()+"��������ʮ���ʱ�仹��"+(30-p.getAge())+"��");
	}
}

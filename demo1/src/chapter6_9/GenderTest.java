package chapter6_9;

public class GenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ��Enum��valueOf()��������ȡ�ƶ�ö�����ö��ֵ
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		//ֱ��Ϊö��ֵ��nameʵ��������ֵ
		g.name = "Ů";
		//ֱ�ӷ���ö��ֵ��nameʵ������
		System.out.println(g+"����"+g.name);
	}

}

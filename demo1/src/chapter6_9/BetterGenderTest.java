package chapter6_9;

public class BetterGenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterGender g = BetterGender.valueOf("FEMALE");
		g.setName("Ů");
		System.out.println(g+"����"+g.getName());
		//��ʱ����nameֵʱ������ʾ��������
		//���g���õ�ΪMALE���������Ϊ��������
		g.setName("��");
		System.out.println(g+"����"+g.getName());
	}

}

package chapter6_9;

public class EnumTest {
	public void judge(SeasonEnum s) {
		//switch�����ı��ʽ������ö��ֵ
		switch (s) {
		case SPRING:
			System.out.println("��ů����������̤��");
			break;
		case SUMMER:
			System.out.println("�������ף��ʺ���Ӿ");
			break;
		case FALL:
			System.out.println("�����ˬ��������ʱ");
			break;
		case WINTER:
			System.out.println("����ѩƮ��Χ¯��ѩ");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ö����Ĭ����һ��values()���������ظ�ö���������ʵ��
		for(SeasonEnum s: SeasonEnum.values()) {
			System.out.println(s);
		}
		//ʹ��ö����ʵ��ʱ����ͨ��EnumClass.variable��ʽ������
		new EnumTest().judge(SeasonEnum.SPRING);
	}

}

package chapter6_7;
class StaticOut{
	//����һ����̬�ڲ��࣬��ʹ�÷��ʿ��Ʒ�
	//��ͬһ�����е���������Է��ʸ��ڲ���
	static class StaticIn{
		public StaticIn(){
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class CreateStaticInnerInstance {
	public static void main(String[] args) {
		StaticOut.StaticIn in = new StaticOut.StaticIn();
	}
}

package chapter6_7;
class Out{
	//����һ���ڲ��࣬��ʹ�÷��ʿ��Ʒ�
	//��ֻ��ͬһ�����е�������ɷ��ʸ��ڲ���
	class In{
		public In(String msg) {
			System.out.println(msg);
		}
	}
}
public class CreateInnerInstance {
	public static void main(String[] args) {
		Out.In in = new Out().new In("������Ϣ");
		/*
		���������Ը�Ϊ�������д���
		ʹ��OutterClass.InnerClass����ʽ�����ڲ������
		Out.In in;
		�����ⲿ��ʵ�����Ѿ�̬�ڲ���ʵ���������ڸ�ʵ����
		Out out = new Out();
		ͨ���ⲿ��ʵ����new�������ڲ��๹���������Ǿ�̬�ڲ���ʵ��
		in = out.new In("������Ϣ");
		*/
	}
}

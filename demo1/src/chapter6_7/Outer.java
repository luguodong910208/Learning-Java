package chapter6_7;

public class Outer {
	private int outProp = 9;
	class Inner{
		private int inProp = 5;
		public void acessOuterProp() {
			//�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���private��Ա����
			System.out.println("�ⲿ���outPropֵ��"+outProp);
			
		}
	}
	public void acessInnerProp() {
		//�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ������
		//���������ֱ������
		//System.out.println("�ڲ����inPropֵ:"+inProp);
		//��������ڲ����ʵ��������������ʾ�����ڲ������
		System.out.println("�ڲ����inPropֵ��"+new Inner().inProp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();
		out.acessInnerProp();
	}

}

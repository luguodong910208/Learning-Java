package chapter6_8;
interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}
interface Addable{
	int add(int a, int b);
}
public class LambdaQs {
	//���ø÷�����ҪEatable����
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}
	//���ø÷�����ҪFlyable����
	public void drive(Flyable f) {
		System.out.println("�����ڼ�ʻ��"+f);
		f.fly("���̿���ϴ�����ա�");
	}
	//���ø÷�����ҪAddable����
	public void test(Addable add) {
		System.out.println("5��3�ĺ��ǣ�"+add.add(5, 3));
	}
	public static void main(String[] args) {
		LambdaQs lq = new LambdaQs();
		//Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի�����
		lq.eat(()-> System.out.println("ƻ����ζ������"));
		//Lambda���ʽ���β��б�ֻ��һ���βΣ�����ʡ��Բ����
		lq.drive(weather -> {
			System.out.println("���������ǣ�"+weather);
			System.out.println("ֱ��������ƽ��");
		});
		//Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի�����
		//�������ֻ��һ����䣬��ʱ�ñ��ʽ��Ҫ����ֵ��Ҳ����ʡ��return�ؼ���
		lq.test((a , b) -> a+b);
	}
}

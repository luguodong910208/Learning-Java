package compositetest;
class Animal{
	private void beat() {
		System.out.println("��������...");
	}
	public void breath() {
		System.out.println("��һ��������һ������������...");
	}
}
class Bird{
	//��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Bird(Animal a) {
		this.a = a;
	}
	//���¶���һ���Լ���breath()����
	public void breath() {
		a.breath();
		//ֱ�Ӹ���Animal�ṩ��breath()������ʵ��Bird��breath()����
	}
	public void fly() {
		System.out.println("����������ڵķ���...");
	}
}

class Wolf{
	private Animal a;
	public Wolf(Animal a) {
		this.a = a;
	}
	public void breath() {
		a.breath();
	}
	public void run() {
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class CompositeTest {
	public static void main(String[] args) {
		Animal a1=new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//��ʱ��Ҫ��ʽ��������ϵĶ���
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();
	}
}

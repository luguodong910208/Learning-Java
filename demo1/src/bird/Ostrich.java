package bird;

public class Ostrich extends Bird {
	public void fly() {
		System.out.println("��ֻ���ڵ��ϱ���...");
	}
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.weight = 1000;
		bird.fly();
		bird.eat();
	}
}

package tostringtest;

class Apple{
	private String color;
	private double weight;
	public Apple() {}
	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}
	public String toString() {
		return "һ��ƻ������ɫ�ǣ�"+color+",�����ǣ�"+weight;
	}
}
public class ToStringTest {
	public static void main(String[] args) {
		Apple a = new Apple("��ɫ",5.68);
		System.out.println(a);
	}
}

package constructor;

public class Apple {
	public String name;
	public String color;
	public double weight;
	public Apple() {}
	//���������Ĺ�����
	public Apple(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//���������Ĺ�������ֱ�ӵ���������Ĺ�����
	public Apple(String name, String color, double weight) {
		//ͨ��this��������һ�����Ӱ��Ĺ������ĳ�ʼ������
		this(name,color);
		this.weight = weight;
	}
}


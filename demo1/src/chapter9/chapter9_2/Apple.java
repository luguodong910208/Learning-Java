package chapter9.chapter9_2;



public class Apple<T> {
	private T info;
	public Apple() {};
	public Apple(T info) {
		this.info = info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public T getInfo() {
		return this.info;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����T�β���String���ͣ���ˣ�����������ֻ�����ַ�����
		Apple<String> al = new Apple<>("ƻ��");
		System.out.println(al.getInfo());
		//���ڴ���T�βε���Double�����Թ���������������Double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}

}

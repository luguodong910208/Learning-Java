package chapter6_6;

public class AddCommand {
	public void process(int[] target) {
		int sum = 0;
		for(int tmp : target) {
			sum += tmp;
		}
		System.out.println("����Ԫ�ص��ܺ��ǣ�"+sum);
	}
}

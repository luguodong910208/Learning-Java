package chapter6_6;

public class CommandTest {
	public static void mian(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {3,-4,6,4};
		//��һ�δ������飬���崦����Ϊȡ����PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("------------------");
		//�ڶ��δ������飬���崦����Ϊȡ����AddCommand
		pa.process(target, new AddCommand());
	}
}

package computerr;

import Lee.Output;

public class Computer {
	private Output out;
	public Computer(Output out) {
		this.out = out;
	}
	//����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg) {
		out.getData(msg);
	}
	//����һ��ģ���ӡ�ķ���
	public void print() {
		out.out();
	}
}

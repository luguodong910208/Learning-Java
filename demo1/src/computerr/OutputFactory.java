package computerr;

import Lee.Output;
import printer.Printer;

public class OutputFactory {
	public Output getOutput() {
		return new Printer();
	}
	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("������java ee��ҵӦ��ʵս");
		c.keyIn("���java����");
		c.print();
	}
}

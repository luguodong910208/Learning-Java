package printer;

import Lee.Output;

//����һ��product�ӿ�
interface Product{
	int getProduceTime();
}

//��Printer��ʵ��Output��Product�ӿ�
public class Printer implements Output, Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	private int dataNum = 0;
	public void out() {
		while (dataNum > 0) {
			System.out.println("��ӡ����ӡ��"+printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ����ȥ1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("����������������ʧ��");
		} else {
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime() {
		return 45;
	}
	public static void main(String[] args) {
		//����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("������Java EE��ҵӦ��ʵս");
		o.getData("���java����");
		o.out();
		o.getData("���Android����");
		o.getData("���Ajax����");
		o.out();
		//����Output�ӿ��ж����Ĭ�Ϸ���
		o.print("�����","��˽�","�׹Ǿ�");
		o.test();
		//����һ��Printer���󣬵���productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ�������ֱ�Ӹ�ֵ��Object���͵ı���
		Object obj = p;
	}
}

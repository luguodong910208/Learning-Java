package chapter11.chapter11_5;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousEventHandler {
	
	private Frame f = new Frame("����");
	private TextArea ta = new TextArea(6,40);
	public void init() {
		//�������ڲ������ʽ�������¼�����������
		f.addWindowListener(new WindowAdapter() {
			//ʵ���¼�������
			public void windowClosing(WindowEvent e) {
				System.out.println("�û���ͼ�رմ��ڣ�\n");
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousEventHandler().init();
	}

}

package chapter11.chapter11_5;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventQs {

	private Frame f = new Frame();
	private Button ok = new Button("ȷ��");
	private TextField tf = new TextField(30);
	public void init() {
		//ע�������
		ok.addActionListener(new OkListener());
		f.add(tf);
		f.add(ok, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	//�����¼���������
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("�û�������ok��ť");
			tf.setText("HELLO WORLD");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventQs().init();
	}

}

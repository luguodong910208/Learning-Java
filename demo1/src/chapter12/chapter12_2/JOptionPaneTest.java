//package chapter12.chapter12_2;
//
//import java.awt.Component;
//import java.awt.GridLayout;
//import java.util.Date;
//
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.TitledBorder;
//
//public class JOptionPaneTest {
//
//	JFrame jf = new JFrame("����JOptionPane");
//	private ButtonPanel messagePanel;
//	private ButtonPanel messageTypePanel;
//	private ButtonPanel msgPanel;
//	private ButtonPanel confirmPanel;
//	private ButtonPanel optionsPanel;
//	private ButtonPanel inputPanel;
//	private String messageString = "��Ϣ������";
//	private Icon messageIcon = new ImageIcon("ico/heart.png");
//	private Object messageObject = new Date();
//	private Component messageComponent = new JButton("�����Ϣ");
//	private JButton msgBn = new JButton("��Ϣ�Ի���");
//	private JButton confirmBn = new JButton("ȷ�϶Ի���");
//	private JButton inputBn = new JButton("����Ի���");
//	private JButton optionBn = new JButton("ѡ��Ի���");
//	
//	public void init() {
//		JPanel top = new JPanel();
//		top.setBorder(new TitledBorder(new EtchedBorder(), "�Ի����ͨ��ѡ��", TitledBorder.CENTER, TitledBorder.TOP));
//		top.setLayout(new GridLayout(1,2));
//		messageTypePanel = new ButtonPanel("ѡ����Ϣ������", new String[] {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"});
//		messagePanel = new ButtonPanel("ѡ����Ϣ���ݵ�����", new String[] {"�ַ�����Ϣ", "ͼ����Ϣ", "�����Ϣ", "��ͨ������Ϣ", "Object[]��Ϣ"});
//		top.add(messageTypePanel);
//		top.add(messagePanel);
//		JPanel bottom = new JPanel();
//		bottom.setBorder(new TitledBorder(new EtchedBorder(),"������ͬ�ĶԻ���", TitledBorder.CENTER, TitledBorder.TOP));
//		bottom.setLayout(new GridLayout(1,4));
//		msgPanel = new ButtonPanel("��Ϣ�Ի���", null);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	
//	class ButtonPanel extends JPanel{
//		
//	}
//
//}

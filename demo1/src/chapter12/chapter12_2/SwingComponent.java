package chapter12.chapter12_2;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SwingComponent {
	JFrame f = new JFrame("����");
	Icon okIcon = new ImageIcon("ico/ok.png");
	JButton ok = new JButton("ȷ��", okIcon);
	JRadioButton female = new JRadioButton("Ů", false);
	JRadioButton male = new JRadioButton("��", true);
	ButtonGroup bg = new ButtonGroup();
	JCheckBox married = new JCheckBox("�Ƿ��ѻ飿", false);
	String[] colors = new String[] {"��ɫ", "��ɫ", "��ɫ"};
	JComboBox<String> colorChooser = new JComboBox<>(colors);
	JList<String> colorList = new JList<>(colors);
	//����һ��8�С�20�еĶ����ı���
	JTextArea ta = new JTextArea(8,20);
	//����һ��40�еĵ����ı���
	JTextField name = new JTextField(40);
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("�ļ�");
	JMenu edit = new JMenu("�༭");
	//�������½����˵��Ϊ֮�ƶ�ͼ��
	Icon newIcon = new ImageIcon("icon/new.png");
	JMenuItem newItem = new JMenuItem("�½�", newIcon);
	Icon saveIcon = new ImageIcon("icon/save.png");
	JMenuItem saveItem = new JMenuItem("����", saveIcon);
	Icon exitIcon = new ImageIcon("icon/exit.png");
	JMenuItem exitItem = new JMenuItem("�˳�", exitIcon);
	JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("�Զ�����");
	JMenuItem copyItem = new JMenuItem("����", new ImageIcon("ico/copy.png"));
	JMenuItem pasteItem = new JMenuItem("ճ��", new ImageIcon("ico/paste.png"));
	JMenu format = new JMenu("��ʽ");
	JMenuItem commentItem = new JMenuItem("ע��");
	JMenuItem cancelItem = new JMenuItem("ȡ��ע��");
	//����һ���Ҽ��˵��������ó�����
	JPopupMenu pop = new JPopupMenu();
	ButtonGroup flavorGroup = new ButtonGroup();
	JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal���", true);
	JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus���");
	JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows���");
	JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows������");
	JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif���");
	public void init() {
		//����װ�����ı���Ͱ�ť��JPanel
		JPanel bottom = new JPanel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom, BorderLayout.SOUTH);
		//����װ��������ѡ��������JCheckBox��JPanel
		JPanel checkPanel = new JPanel();
		checkPanel.add(colorChooser);
		bg.add(male);
		bg.add(female);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		//����һ����ֱ���������Box��ʢװ�����ı���JPanel
		Box topLeft = Box.createVerticalBox();
		JScrollPane taJsp = new JScrollPane(ta);
		topLeft.add(taJsp);
		topLeft.add(checkPanel);
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		f.add(top);
		newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
		newItem.addActionListener(e -> ta.append("�û������ˡ��½����˵�\n"));
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);
		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		commentItem.setToolTipText("���������ע��������");
		format.add(commentItem);
		format.add(cancelItem);
		edit.add(new JMenuItem("-"));
		edit.add(format);
		mb.add(file);
		mb.add(edit);
		f.setJMenuBar(mb);
		flavorGroup.add(metalItem);
		flavorGroup.add(nimbusItem);
		flavorGroup.add(windowsItem);
		flavorGroup.add(classicItem);
		flavorGroup.add(motifItem);
		pop.add(metalItem);
		pop.add(nimbusItem);
		pop.add(windowsItem);
		pop.add(classicItem);
		pop.add(motifItem);
		ActionListener flavorListener = e -> {
			try {
				switch(e.getActionCommand()) {
				case "Metal���":
					changeFlavor(1);
					break;
				case "Nimbus���":
					changeFlavor(2);
					break;
				case "Windows���":
					changeFlavor(3);
					break;
				case "Windows������":
					changeFlavor(4);
					break;
				case "Motif���":
					changeFlavor(5);
					break;
				}
			}
			catch(Exception ee){
				ee.printStackTrace();
			}
		};
		metalItem.addActionListener(flavorListener);
		nimbusItem.addActionListener(flavorListener);
		windowsItem.addActionListener(flavorListener);
		classicItem.addActionListener(flavorListener);
		motifItem.addActionListener(flavorListener);
		ta.setComponentPopupMenu(pop);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
	}
	private void changeFlavor(int flavor) throws Exception{
		switch(flavor) {
		case 1:
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			break;
		case 2:
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			break;
		case 3:
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			break;
		case 4:
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
			break;
		case 5:
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			break;
		}
		SwingUtilities.updateComponentTreeUI(f.getContentPane());
		SwingUtilities.updateComponentTreeUI(mb);
		SwingUtilities.updateComponentTreeUI(pop);
	}
	public static void main(String[] args) {
		new SwingComponent().init();
	}
}

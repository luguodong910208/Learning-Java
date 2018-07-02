package chapter12.chapter12_2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JToolBarTest {
	JFrame jf = new JFrame("���Թ�����");
	JTextArea jta = new JTextArea(6,35);
	JToolBar jtb = new JToolBar();
	JMenuBar jmb = new JMenuBar();
	JMenu edit = new JMenu("�༭");
	//��ȡϵͳ������
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//������ճ����Action,���ڴ����˵�����߰�ť����ͨ��ť
	Action pasteAction = new AbstractAction("ճ��", new ImageIcon("ico/paste.png")) {
		public void actionPerformed(ActionEvent e) {
			//������������stringFlavor����
			if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
				try {
					//ȡ����������
					String content = (String)clipboard.getData(DataFlavor.stringFlavor);
					jta.replaceRange(content, jta.getSelectionStart(), jta.getSelectionEnd());
				}
				catch(Exception ee) {
					ee.printStackTrace();
				}
			}
		}
	};
	//������ֵAction
	Action copyAction = new AbstractAction("����", new ImageIcon("ico/copy.png")) {
		public void actionPerformed(ActionEvent e) {
			StringSelection contents = new StringSelection(jta.getSelectedText());
			clipboard.setContents(contents, null);
			if(clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
				pasteAction.setEnabled(true);
			}
		}
	};
	public void init() {
		pasteAction.setEnabled(false);
		jf.add(new JScrollPane(jta));
	}
	
}

package chapter11.chapter11_6;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.sun.glass.events.KeyEvent;

public class SimpleMenu {

	private Frame f = new Frame("����");
	private MenuBar mb = new MenuBar();
	Menu file = new Menu("�ļ�");
	Menu edit = new Menu("�༭");
	MenuItem newItem = new MenuItem("�½�");
	MenuItem saveItem = new MenuItem("����");
	MenuItem exitItem = new MenuItem("�˳�", new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap = new CheckboxMenuItem("�Զ�����");
	MenuItem copyItem = new MenuItem("����");
	MenuItem pasteItem = new MenuItem("ճ��");
	Menu format = new Menu("��ʽ");
	MenuItem commentItem = new MenuItem("ע��", new MenuShortcut(KeyEvent.VK_SLASH, true));
	MenuItem cancelItem = new MenuItem("ȡ��ע��");
	private TextArea ta = new TextArea(6,40);
	public void init() {
		ActionListener menuListener = e ->{
			String cmd = e.getActionCommand();
			ta.append("������"+cmd+"���˵�"+"\n");
			if(cmd.equals("�˳�")) {
				System.exit(0);
			}
		};
		commentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);
		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		format.add(commentItem);
		format.add(cancelItem);
		edit.add(new MenuItem("-"));
		edit.add(format);
		mb.add(file);
		mb.add(edit);
		f.setMenuBar(mb);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleMenu().init();
	}

}

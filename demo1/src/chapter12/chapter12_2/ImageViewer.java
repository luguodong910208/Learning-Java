package chapter12.chapter12_2;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

public class ImageViewer {
	final int PREVIEW_SIZE = 100;
	JFrame jf = new JFrame("��ͼƬ�鿴��");
	JMenuBar menuBar = new JMenuBar();
	JLabel label = new JLabel();
	JFileChooser chooser = new JFileChooser(".");
	JLabel accessory = new JLabel();
	ExtensionFileFilter filter = new ExtensionFileFilter();
	public void init() {
		filter.addExtension("jpg");
		filter.addExtension("jpeg");
		filter.addExtension("gif");
		filter.addExtension("png");
		filter.setDescription("ͼƬ�ļ�(*.jpg, *.jpeg, *.gif, *.png)");
		chooser.addChoosableFileFilter(filter);
		//��ֹ���ļ����͡������б�����ʾ�������ļ���ѡ��
		chooser.setAcceptAllFileFilterUsed(false);
		//Ϊ�ļ�ѡ�����ƶ��Զ����fileView����
		chooser.setFileView(new FileIconView(filter));
		//Ϊ�ļ�ѡ����ָ��һ��Ԥ��ͼƬ�ĸ���
		chooser.setAccessory(accessory);
		accessory.setPreferredSize(new Dimension(PREVIEW_SIZE, PREVIEW_SIZE));
		accessory.setBorder(BorderFactory.createEtchedBorder());
		chooser.addPropertyChangeListener(event -> {
			if(event.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY) {
				File f = (File) event.getNewValue();
				if(f == null) {
					accessory.setIcon(null);
					return;
				}
				//����ѡ�ļ�����ImageIcon������
				ImageIcon icon = new ImageIcon(f.getPath());
				if(icon.getIconWidth() > PREVIEW_SIZE) {
					icon = new ImageIcon(icon.getImage().getScaledInstance(PREVIEW_SIZE, -1, Image.SCALE_DEFAULT));
				}
				accessory.setIcon(icon);
			}
		});
		JMenu menu = new JMenu("�ļ�");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("��");
		menu.add(openItem);
		openItem.addActionListener(event -> {
			int result =chooser.showDialog(jf, "��ͼƬ�ļ�");
			if(result == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(event -> System.exit(0));
		jf.setJMenuBar(menuBar);
		jf.add(new JScrollPane(label));
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new ImageViewer().init();
	}
}

class ExtensionFileFilter extends FileFilter{
	private String description;
	private ArrayList<String> extensions = new ArrayList<>();
	public void addExtension(String extension) {
		if(!extension.startsWith(".")) {
			extension = "."+extension;
			extensions.add(extension.toLowerCase());
		}
	}
	public void setDescription(String aDescription) {
		description = aDescription;
	}
	public String getDescription() {
		return description;
	}
	public boolean accept(File f){
		if(f.isDirectory()) return true;
		String name = f.getName().toLowerCase();
		for(String extension : extensions) {
			if(name.endsWith(extension)) {
				return true;
			}
		}
		return false;
	}
}

class FileIconView extends FileView{
	private FileFilter filter;
	public FileIconView(FileFilter filter) {
		this.filter = filter;
	}
	public Icon getIcon(File f) {
		if(!f.isDirectory() && filter.accept(f)) {
			return new ImageIcon("ico/pict.png");
		}
		else if(f.isDirectory()) {
			File[] fList = File.listRoots();
			for(File tmp : fList) {
				if(tmp.equals(f)) {
					return new ImageIcon("ico/dsk.png");
				}
			}
			return new ImageIcon("ico/folder.png");
		}
		else {
			return null;
		}
	}
}
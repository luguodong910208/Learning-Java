package informationManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//����ר�ű���Ͷ�ȡ����
public class FileOperate {

	private File file=null;
	//ͨ�����췽�������ļ�·��
	public FileOperate(String pathName) {
		this.file = new File(pathName);
	}
	
	public boolean save(Object obj) throws Exception{
		ObjectOutputStream oos = null;//���������
		boolean flag = false;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(this.file));//ʵ�������������
			oos.writeObject(obj);
			flag = true;
		}catch(Exception e) {
			throw e;
		}finally {
			if(oos != null) {
				oos.close();
			}
		}
		return flag;
		
	}
	public Object load() throws Exception{
		Object obj = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(this.file));
			obj = ois.readObject();
		}catch(Exception e) {
			throw e;
		}finally {
			if(ois!= null) {
				ois.close();
			}
		}
		return obj;
		
	}
}

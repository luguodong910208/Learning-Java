package chapter7_2;

import java.util.Map;
import java.util.Properties;

public class SystemTest{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//��ȡϵͳ���еĻ�������
		Map<String, String> env = System.getenv();
		for(String name : env.keySet()) {
			System.out.println(name+"--->"+env.get(name));
		}
		//��ȡ�ƶ�����������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		//�����е�ϵͳ���Ա��浽props.txt�ļ���
//		props.store(new FileOutputStream("props.txt"), "System Properties");
		//����ض���ϵͳ����
//		System.out.println(System.getProperty("os.name"));
	}

}

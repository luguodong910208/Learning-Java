package chapter7.chapter7_6;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		//����ָ���Ĺ���/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle("mess", myLocale);
		//��ӡ����Դ�ļ���ȡ����Ϣ
		System.out.println(bundle.getString("hello"));
	}

}

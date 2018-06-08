package chapter7.chapter7_6;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Date;

public class HelloArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Locate����
		Locale currentLocale = null;
		//������г����ƶ�����������
		if(args.length == 2) {
			//ʹ�����г����������������Localeʵ��
			currentLocale = new Locale(args[0], args[1]);
		}
		else {
			//����ֱ��ʹ��ϵͳĬ�ϵ�Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		//����Locale����������Դ
		ResourceBundle bundle = ResourceBundle.getBundle("myMess", currentLocale);
		//ȡ���Ѽ��ص�������Դ�ļ��е�msg��Ӧ��Ϣ
		String msg = bundle.getString("msg");
		//ʹ��MessageFormatΪ��ռλ�����ַ����������
		System.out.println(MessageFormat.format(msg, "yeeku", new Date()));
	}

}

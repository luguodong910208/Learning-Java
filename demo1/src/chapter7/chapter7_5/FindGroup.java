package chapter7.chapter7_5;

import java.util.regex.*;

public class FindGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʹ���ַ���ģ��������ϵõ�����ҳԴ��
		String str = "������һ���鼮��������ϵ�ң�13500006666"+"������13611125565"+"���۶��ֵ���15899903312";
		//����һ��Pattern���󣬲���������һ��Matcher����
		//��������ʽֻץȡ13X��15X�ε��ֻ���
		//ʵ��Ҫץȡ����Щ�绰���룬ֻҪ�޸�������ʽ�ͺ�
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//�����з���������ʽ���Ӵ�ȫ�����
		while(m.find()) {
			System.out.println(m.group());
		}
				
	}

}

package chapter7.chapter7_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��pattern���󣬲���������һ��Matcher����
		String regStr = "Java is very easy";
		System.out.println("Ŀ���ַ����ǣ�"+regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find()) {
			System.out.println(m.group()+"�Ӵ�����ʼλ�ã�"+m.start()+",�����λ�ã�"+m.end());
		}
	}

}

package chapter7.chapter7_6;

import java.util.Locale;

public class LocaleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Java��֧�ֵ�ȫ�����Һ����Ե�����
		Locale[] localeList = Locale.getAvailableLocales();
		//���������ÿ��Ԫ�أ����λ�ȡ��֧�ֵĹ��Һ�����
		for(int i=0; i<localeList.length; i++) {
			//�����֧�ֹ��Һ�����
			System.out.println(localeList[i].getDisplayCountry()
					+"="+localeList[i].getCountry()+" "
					+localeList[i].getDisplayLanguage()
					+"="+localeList[i].getLanguage());
		}
	}

}

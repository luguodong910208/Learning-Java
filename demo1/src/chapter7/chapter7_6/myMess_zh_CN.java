package chapter7.chapter7_6;

import java.util.ListResourceBundle;

public class myMess_zh_CN extends ListResourceBundle{
	private final Object myData[][]= {
			{"msg","��ã������������{1}"}
	};
	//��дgetContents()����
	public Object[][] getContents(){
		//�÷���������Դ��key-value��
		return myData;
	}
}

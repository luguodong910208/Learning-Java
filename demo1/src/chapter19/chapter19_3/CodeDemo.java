package chapter19.chapter19_3;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class CodeDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String keyWord = "shenzhen ½����";
		String encod = URLEncoder.encode(keyWord, "UTF-8");
		System.out.println("����֮������ݣ�"+encod);
		String decod = URLDecoder.decode(encod, "UTF-8");
		System.out.println("����֮�������:"+decod);
	}

}

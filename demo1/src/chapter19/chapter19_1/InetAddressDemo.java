package chapter19.chapter19_1;

import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InetAddress locAdd = null;
		InetAddress remAdd = null;
		locAdd = InetAddress.getLocalHost();
		remAdd = InetAddress.getByName("www.mldnjava.cn");
		System.out.println("����IP��ַ:"+locAdd.getHostAddress());
		System.out.println("MLDNJAVA��IP��ַ:"+remAdd.getHostAddress());
		System.out.println("�����Ƿ�ɴ�:"+locAdd.isReachable(5000));
	}

}

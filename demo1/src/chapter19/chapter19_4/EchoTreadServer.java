package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class EchoTreadServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server =null;//�������
		Socket client = null;//���Ķ��󣬱�ʾ�ͻ���
		server = new ServerSocket(8888);//��������8888�ӿڼ���
		boolean f = true;//������λ
		while(f) {
			System.out.println("���������У��ȴ��ͻ�������");
			client = server.accept();
			new Thread(new EchoThread(client)).start();
		}
		server.close();
	}

}

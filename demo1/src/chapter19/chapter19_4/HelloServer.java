package chapter19.chapter19_4;
import java.net.*;
import java.io.*;

public class HelloServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client = null;
		PrintStream out = null;
		server = new ServerSocket(8888);
		System.out.println("�������������У��ȴ��ͻ�������");
		client = server.accept();
		String str = "hello World!";
		out = new PrintStream(client.getOutputStream());
		out.println(str);
		out.close();
		client.close();
		server.close();
	}

}

package chapter20.chapter20_2;
import java.nio.IntBuffer;

public class IntBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);//����10��������
		System.out.print("1.д������֮ǰ��position/limit��capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		int temp[] = {5,7,9};
		buf.put(3);//�뻺����д������
		buf.put(temp);
		System.out.println("2.д������֮���position/limit��capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		buf.flip();//���軺����
		System.out.print("3.׼���������ʱ��position/limit��capacity:");
		System.out.println("position="+buf.position()+",limit="+buf.limit()+",capacity="+buf.capacity());
		System.out.println("�������е�����");
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println(x+"��");
		}
	}

}

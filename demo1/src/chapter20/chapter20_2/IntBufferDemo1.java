package chapter20.chapter20_2;
import java.nio.IntBuffer;

public class IntBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBuffer buf = IntBuffer.allocate(10);//����10��������
		IntBuffer sub = null;//���建��������
		for(int i=0; i<10; i++) {
			buf.put(2*i+1);
		}
		buf.position(2);//��������ָ�������ڵ�����Ԫ��
		buf.limit(6);
		sub = buf.slice();
		for(int i=0; i<sub.capacity(); i++) {
			int temp = sub.get(i);
			sub.put(temp-1);
		}
		buf.flip();
		buf.limit(buf.capacity());
		System.out.println("�������е�����");
		while(buf.hasRemaining()) {
			int x = buf.get();
			System.out.println(x+"��");
		}
	}

}

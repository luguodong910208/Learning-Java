package chapter9.chapter9_4;

class MyThread5 implements Runnable{
	public void run() {
		System.out.println("1.����RUN����");
		try {
			Thread.sleep(10000);
			System.out.println("2.�Ѿ��������");
		}
		catch(Exception e){
			System.out.println("3.���߱���ֹ");
			return;
		}
		System.out.println("4.run������������");
	}
}

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 mt = new MyThread5();
		Thread t = new Thread(mt,"�߳�");
		t.start();
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {}
		t.interrupt();
	}

}

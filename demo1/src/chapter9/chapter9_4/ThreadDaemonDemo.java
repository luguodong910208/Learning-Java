package chapter9.chapter9_4;

class MyThread6 implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+"������.");
		}
	}
}

public class ThreadDaemonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread6 mt = new MyThread6();
		Thread t = new Thread(mt,"�߳�");
		t.setDaemon(true);
		t.start();
	}

}

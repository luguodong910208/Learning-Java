package chapter9.chapter9_4;

class MyThread2 implements Runnable{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+"����,i="+i);
		}
	}
}

public class ThreadAliveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt,"�߳�");
		System.out.println("�߳̿�ʼִ��֮ǰ -->"+t.isAlive());
		t.start();
		System.out.println("�߳̿�ʼִ��֮�� -->"+t.isAlive());
		for(int i=0; i<3; i++) {
			System.out.println("main���� -->"+i);
		}
		System.out.println("����ִ��֮�� -->"+t.isAlive());
	}

}

package chapter9.chapter9_4;

class MyThread implements Runnable{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName()+"����,i="+i);
		}
	}
}

public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my = new MyThread();
		new Thread(my).start();
		new Thread(my,"�߳�-A").start();
		new Thread(my,"�߳�-B").start();
		new Thread(my).start();
		new Thread(my).start();
	}

}

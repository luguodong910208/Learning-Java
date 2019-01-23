package p20190122;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			int i = 0;
			while(!isInterrupted()) {
				Thread.sleep(1000);
				i++;
				System.out.println(Thread.currentThread().getName() + " ("+this.getState()+") loop " + i);
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() +" ("+this.getState()+") catch InterruptedException.");
		}
	}
}

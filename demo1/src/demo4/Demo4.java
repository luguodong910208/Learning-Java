package demo4;

public class Demo4 {
	public void jump() {
		System.out.println("����ִ��jump����");
	}
	public void run() {
//		Demo4 d = new Demo4();
//		d.jump();
		
//��������this�������Demo4
//		this.jump();
		
		
//��������Java��������һ����Աֱ�ӵ�����һ����Ա��this����ʡ�ԣ����Ǿ�̬��Ա����ֱ�ӷ��ʷѾ�̬��Ա
		jump();
		System.out.println("����ִ��run����");
	}
}

package practise50;
/**
 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���
 * �������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
 * @author lu
 *
 */
public class Program3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=100; i<1000; i++) {
			int bite = i %10;
			int ten = i/10%10;
			int hundred = i/100;
			if(i==(bite*bite*bite)+(ten*ten*ten)+(hundred*hundred*hundred)) {
				System.out.print(i+" ");
				sum++;
				if(sum%10==0) {
					System.out.println();
				}
			}
		}
	System.out.println("����ˮ�ɻ���:"+sum);
	}

}

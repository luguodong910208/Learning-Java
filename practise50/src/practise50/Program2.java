package practise50;
/**
 *�ж�101-200֮���ж��ٸ����������������������

    * �����ǣ�ֻ�ܱ�1���������������磺3,5,7,11,131... 
      *�ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)��
      *����ܱ����������������������������֮��������
 * @author lu
 *
 */

public class Program2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=100; i<200; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				sum++;
				if(sum%10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("�����ĸ���:"+sum);
	}
	private static boolean isPrime(int n) {
		for(int j=2; j<Math.sqrt(n); j++) {
			if(n % j == 0) {
				return false;
			}
		}
		return true;
	}
}

/**
 * ��Ŀ���£�f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),��f(10)Ϊ���͵ĵݹ鷽��
 */

package recursive;

public class Recursive {
	public static int fn(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n ==1){
			return 4;
		}
		else {
			return 2*fn(n-1)+fn(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fn(10));
	}
}

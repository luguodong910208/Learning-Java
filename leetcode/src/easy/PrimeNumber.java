package easy;

public class PrimeNumber {

	public void IsPrimeNumber(int num) {
		boolean result = true;
		for(int i=2; i*i <= num; i++) {
			if(num % i == 0) {
				result = false;
				break;
			}
		}
		if(result) {
			System.out.println(num+"������");
		}else {
			System.out.println(num+"��������");
		}
	}
	
}

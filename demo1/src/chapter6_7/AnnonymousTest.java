package chapter6_7;
interface Product{
	public double getPrice();
	public String getName();
}
public class AnnonymousTest {
	public void test(Product p) {
		System.out.println("������һ��"+p.getName()+",������"+p.getPrice());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymousTest ta = new AnnonymousTest();
		//����test()����ʱ����Ҫ����һ��Product����
		//�˴�����������ʵ�����ʵ��
		//����Ĵ���ȼ������µĴ���
//		class AnnonymousProduct implements Product{
//			public double getPrice() {
//				return 567.8;
//			}
//			public String getName() {
//				return "AGP�Կ�";
//			}
//		}
		ta.test(new Product() {
			public double getPrice() {
				return 527.8;
			}
			public String getName() {
				return "AGP�Կ�";
			}
		});
	}

}

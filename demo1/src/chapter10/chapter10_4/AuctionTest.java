package chapter10.chapter10_4;

public class AuctionTest {

	private double initPrice = 30.0;
	//��Ϊ��������ʾ�׳���AuctionException�쳣
	//���Դ˴���Ҫ�����׳�AuctionException�쳣
	public void bid(String bidPrice) throws Auction{
		double d = 0.0;
		try {
			d = Double.parseDouble(bidPrice);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Auction("���ļ۸��������ֵ��"+"���ܰ��������ַ�");
		}
		if(initPrice > d) {
			throw new Auction("���ļ۸�����ļ۵ͣ���ֹ����");
		}
		initPrice = d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionTest at = new AuctionTest();
		try {
			at.bid("df");
		}
		catch(Auction ae) {
			System.err.println(ae.getMessage());
		}
	}

}

package speedmeter;

public abstract class SpeedMeter {
	//ת��
	private double turnRate;
	public SpeedMeter() {}
	//�ѷ��س��ְ뾶�ķ�������Ϊ���󷽷�
	public abstract double getRadius();
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed() {
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}

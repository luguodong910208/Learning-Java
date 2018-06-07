package chapter7_3;
class Address{
	String detail;
	public Address(String detail) {
		this.detail = detail;
	}
}
//ʵ��Cloneable�ӿ�
class User implements Cloneable{
	int age;
	Address address;
	public User(int age){
		this.age = age;
		address = new Address("�������");
	}
	//ͨ������super.clone()��ʵ��clone()����
	public User clone() 
		throws CloneNotSupportedException
	{
		return (User)super.clone();
	}
}
public class CloneTest {
	public static void main(String[] args) 
	throws CloneNotSupportedException{
		User u1 = new User(29);
		//clone�õ�u1����ĸ���
		User u2 = u1.clone();
		//�ж�u1��u2�Ƿ���ͬ
		System.out.println(u1 == u2);
		//�ж�u1��u2��address�Ƿ���ͬ
		System.out.println(u1.address == u2.address);
	}
}

package chapter8.chapter8_2;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		//���Ԫ��
		c.add("�����");
		//��Ȼ�������治�ܷŻ������͵�ֵ����Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		//�ж��Ƿ����ָ���ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ�����"+c.contains("�����"));
		
	}

}

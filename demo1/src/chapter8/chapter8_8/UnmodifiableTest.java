package chapter8.chapter8_8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class UnmodifiableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ���յġ����ɸı��List����
		List unmodifiableList = Collections.emptyList();
		//����ֻ��һ��ֻ��һ��Ԫ�أ��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("���JAVA����");
		//����һ��Map����
		Map scores = new HashMap();
		scores.put("����", 80);
		scores.put("JAVA", 82);
		//������ͨ��Map�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д��붼������UnsupportedOperationException�쳣,��Ϊ����Ϊ���ɱ伯��
		unmodifiableList.add("����Ԫ��");
		unmodifiableSet.add("����Ԫ��");
		unmodifiableMap.put("MATH",90);
	}

}

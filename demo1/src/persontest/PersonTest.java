//��Ա�����;ֲ�����
package persontest;
//����һ����
class Person{
	//����һ��ʵ������
	public String name;
	//����һ�������
	public static int eyeNum;
}
public class PersonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ������ʹ��Person�࣬�����Զ���ʼ������eyeNum������ʼ�����ã����Ϊ0
		System.out.println("Person��eyeNum�����ֵ��"+Person.eyeNum);
		//����Person����
		Person p = new Person();
		//ͨ��Person���������p������Person����nameʵ������
		//��ͨ��ʵ������eyeNum�����
		System.out.println("p������name����ֵ�ǣ�"+p.name+", p�����eyeNum����ֵ�ǣ�"+p.eyeNum);
		//ֱ��ΪNameʵ��������ֵ
		p.name="�����";
		//ͨ��Person����������nameʵ������Ȼ����Person��eyeNum�����
		p.eyeNum = 2;
		//�ٴ�ͨ��Person����������nameʵ��������eyNum�����
		System.out.println("p������name����ֵ�ǣ�"+p.name+", p�����eyeNum����ֵ�ǣ�"+p.eyeNum);
		Person p2=new Person();
		System.out.println("p2�����eyeNum�������ֵ��"+p2.eyeNum);
	}

}

package demo1;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		int classNum =3;
		int stuNum=4;
		double sum=0;
		double avg=0;
		Scanner input = new Scanner(System.in);//����Scanner����
		for (int i=1; i<= classNum; i++) {//���ѭ�����ư༶������
			sum=0;
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int j=1;j<=stuNum;j++) {//�ڲ�ѭ������ÿ���༶ѧ��������
				System.out.println("�������"+j+"��ѧ���ĳɼ���");
				int score=input.nextInt();//��ȡ����ĳɼ�
				sum=sum+score;//�ɼ��ۼ����
			}
			avg=sum/stuNum;
			System.out.println("��"+i+"���༶ѧ����ƽ���ɼ�Ϊ:"+avg);
		}
	}
}
//�����ܽ᣺
//1.ͨ����������ȷ����
//2.�������֪ʶ�㣻
//3.����ʵ�����̣�
//4.�������ϵ���١�������⣻
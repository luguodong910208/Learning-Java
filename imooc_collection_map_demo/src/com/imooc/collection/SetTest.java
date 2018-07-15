package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}
	public void testAdd() {
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
//		System.out.println("����˿γ�:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
//		System.out.println("����˿γ�:"+temp2.id+":"+temp2.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"), new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
//		System.out.println("��������ſγ�:"+temp3.id+":"+temp3.name+";"
//		+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","�ߵ���ѧ"), new Course("6","JAVA����")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
//		System.out.println("��������ſγ�:"+temp5.id+":"+temp5.name+";"
//				+temp6.id+":"+temp6.name);	
	}
	
	public void testForEach() {
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ����"+student.name+"ѡ�Σ�");
		//����һ��Scanner�����������մӼ�������Ŀγ�
		Scanner console = new Scanner(System.in);
	}

}

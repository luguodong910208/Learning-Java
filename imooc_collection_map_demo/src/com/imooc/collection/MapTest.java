package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String, Student> students;
	
	public MapTest() {
		this.students = new HashMap<String, Student>();
	}
	
	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i =0;
		while (i<3) {
			System.out.println("��������ѧ����ID");
			String ID = console.next();
		//�ж�ID�Ƿ�ռ�ã����û�������
			Student st = students.get(ID);
			if(st == null) {
				System.out.println("������ѧ������");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
				i++;
			}else {
				System.out.println("��ѧ���Ѿ���ռ��");
				continue;
			}
		}
	}
	
	public void testKeySet() {
		//����MAP�����м���Set����,���б���
		Set<String> keySet = students.keySet();
		System.out.println("�ܹ��У�"+students.size()+"��ѧ��!");
		for(String stuID:keySet) {
			Student st = students.get(stuID);
			if(st != null) {
				System.out.println("ѧ��:"+st.name);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		
	}

}

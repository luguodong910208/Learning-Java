package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public List coursesToSelect;
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ�:"+temp.id+":"+temp.name);
		
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println("����˿γ�:"+temp2.id+":"+temp2.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"), new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		System.out.println("��������ſγ�:"+temp3.id+":"+temp3.name+";"
		+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","�ߵ���ѧ"), new Course("6","JAVA����")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		System.out.println("��������ſγ�:"+temp5.id+":"+temp5.name+";"
				+temp6.id+":"+temp6.name);	
	}
	
	public void testGet() {
		int size = coursesToSelect.size();
		for(int i=0; i<size; i++) {
			Course cr =(Course)coursesToSelect.get(i);
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	//����������,�������ڴ洢
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	public void testForEach() {
		for(Object obj : coursesToSelect) {
			Course cr = (Course)obj;
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
	}
}

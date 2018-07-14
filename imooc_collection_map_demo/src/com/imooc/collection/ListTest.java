package com.imooc.collection;

import java.util.ArrayList;
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
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
	}
}

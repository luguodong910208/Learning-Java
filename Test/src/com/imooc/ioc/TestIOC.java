package com.imooc.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	@Test
	public void testUser() {
		//����spring�����ļ������ݴ�������
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
		//�õ����ô����Ķ���
		User user=(User)context.getBean("user");
		System.out.println(user);
		user.add();
	}
	
}

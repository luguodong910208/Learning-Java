package test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;

public class UserTest {

	@Test
	public void testFindUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		//ͨ���������������ļ���ȡ����
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//ͨ�����������ļ��������������Ự����
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//ͨ�����������Ự
		SqlSession openSession = factory.openSession();
		//��һ�������������õ�SQL���(User.xml�ļ��е�namespace���Ժ�select����е�id����ֵ)namespace+.+sql��idֵ
		User user = openSession.selectOne("test.findUserById", 1);
		System.out.println(user);
		openSession.close();
	}
	
	@Test
	public void testFindUserByUserName() throws Exception{
		String resource  = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		List<User> list = openSession.selectList("test.findUserByUserName", "%��%");
		System.out.println(list);
		openSession.close();
	}
	
	
	@Test
	public void testInsertUser() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		User user = new User();
		user.setId(6);
		user.setUsername("Winston");
		user.setBirthday(new Date());
		user.setSex("��");
		user.setAddress("����");
		
		openSession.insert("test.insertUser", user);
		//�ύ����(mybatis���Զ��������񣬵�������֪����ʱ�ύ��������Ҫ�ֶ�����)
		openSession.commit();
		
		System.out.println("==="+user.getId());
	}
	
	@Test
	public void testDelUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		openSession.delete("test.delUserById", 6);
		openSession.commit();
	}
	
	
	@Test
	public void testUpdateUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		User user = new User();
		user.setId(6);
		user.setUsername("lu");
		openSession.update("test.updateUserById", user);
		openSession.commit();
	}
}

package cn.itcast.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.*;

public class JdbcTemplateDemo1 {

	//ɾ������
			@Test
			public void delete() {
				//�������ݿ���Ϣ
				DriverManagerDataSource dataSource = new DriverManagerDataSource();
//				dataSource.setDriverClassName("com.mysql.jbdc.Driver");
				dataSource.setUrl("jdbc:mysql:///spring_day3");
				dataSource.setUsername("root");
				dataSource.setPassword("lu910208");
				
				//����jdbcTemplate������������Դ
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				
				//����jdbcTemplate��������ķ���ʵ��update����
				String sql = "delete from user where username=?";
				int rows = jdbcTemplate.update(sql,"lucy");
				System.out.println(rows);
			}
			
			
	
	//�޸Ĳ���
		@Test
		public void update() {
			//�������ݿ���Ϣ
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
//			dataSource.setDriverClassName("com.mysql.jbdc.Driver");
			dataSource.setUrl("jdbc:mysql:///spring_day3");
			dataSource.setUsername("root");
			dataSource.setPassword("lu910208");
			
			//����jdbcTemplate������������Դ
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			//����jdbcTemplate��������ķ���ʵ��update����
			String sql = "update user set password=? where username=?";
			int rows = jdbcTemplate.update(sql, "1314","lucy");
			System.out.println(rows);
		}
		
		
	//��Ӳ���
	@Test
	public void add() {
		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jbdc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day3");
		dataSource.setUsername("root");
		dataSource.setPassword("lu910208");
		
		//����jdbcTemplate������������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//����jdbcTemplate��������ķ���ʵ�ֲ���
		//����sql���
		String sql = "insert into user values(?,?)";
		int rows = jdbcTemplate.update(sql, "lucy","250");
		System.out.println(rows);
	}
}

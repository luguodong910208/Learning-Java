package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class JdbcTemplateDemo2 {
	
	
	//��ѯ���ض���
		@Test
		public void testObject() {
			//�������ݿ���Ϣ
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//	dataSource.setDriverClassName("com.mysql.jbdc.Driver");
			dataSource.setUrl("jdbc:mysql:///spring_day3");
			dataSource.setUsername("root");
			dataSource.setPassword("lu910208");
					
			//����jdbcTemplate������������Դ
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			//���÷�����ѯ��¼��
			String sql = "select * from user where username=?";
			//�ڶ���������Ҫ�Լ�дʵ�ֽӿڣ��Լ������ݷ�װ
			User user = jdbcTemplate.queryForObject(sql, new MyRowMapper(), "lucy");
			System.out.println(user);
			
		}
	
	
	
	
	//jdbcʵ�ִ���
	@Test
	public void testJDBC(){
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ�����
			conn = DriverManager.getConnection("jdbc:mysql:///spring_day3", "root", "lu910208");
			//��дSQL���
			String sql = "select * from user where username=?";
			//Ԥ����sql
			pstm = conn.prepareStatement(sql);
			//���ò���ֵ
			pstm.setString(1, "lucy");
			//ִ��sql
			rs = pstm.executeQuery();
			//���������
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				//�����ݷ���user��������
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				
				System.out.println(user);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//��ѯ�ж�������¼����
	@Test
	public void testCount() {
		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//	dataSource.setDriverClassName("com.mysql.jbdc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day3");
		dataSource.setUsername("root");
		dataSource.setPassword("lu910208");
				
		//����jdbcTemplate������������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//���÷�����ѯ��¼��
		String sql = "select count(*) from user";
		//����jdbcTemplate��������ķ���ʵ��update����
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
		
}

class MyRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int num) throws SQLException {
		// �ӽ������������ݵõ�
		String username = rs.getString("username");
		String password = rs.getString("password");
		//�ѵõ������ݷ�װ����������
		User user = new User();
		user.setPassword(username);
		user.setPassword(password);
		return user;
	}
	
}


package cn.itcast.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrdersDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * dao����Ҫ������ݿ�Ĳ����ķ�������ִ��ҵ�����
	 */
	public void lessMoney() {
		String sql = "update account set salary=salary-? where username=?";
		jdbcTemplate.update(sql,"1000","lucy");
	}
	
	public void moreMoney() {
		String sql = "update account set salary=salary+? where username=?";
		jdbcTemplate.update(sql,"1000","winston");
	}
}

package cn.itcast.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class UserDao {

	
	//�õ�JdbcTemplate����
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void add() {

		//����jdbcTemplate������������Դ
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into user values(?,?)";
		jdbcTemplate.update(sql, "����", "5201314");
	}
}

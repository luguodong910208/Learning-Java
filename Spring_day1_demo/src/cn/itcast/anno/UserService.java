package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	//�õ�dao����
	//1.����dao��������
	//��dao��������ʹ��ע�� �������ע��
//	@Autowired
//	private UserDao userDao;
	//ʹ��ע�ⷽʽ����Ҫset����
	
	@Resource(name="userDao")
	private UserDao userDao;

	public void add() {
		System.out.println("service......");
		userDao.add();
	}
}

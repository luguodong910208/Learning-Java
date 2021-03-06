package com.itcast.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.domain.User;
import com.itcast.service.UserService;

public class LoginServlet extends HttpServlet {
	@Override
	/**
	 * 初始化登录次数
	 */
	public void init() throws ServletException {
		//获取全局管理者
		ServletContext context = this.getServletContext();
		//初始化次数
		context.setAttribute("count", 0);
		System.out.println("完成初始化");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.设置编码格式
		response.setContentType("text/html;charset=utf-8");
		// 2.接受用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 3.调用userService里的login(username,password)，返回值为User user
		User user = null;
		try {
			user = new UserService().login(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("网络异常，请稍后重试");
		}
		// 4.判断user是否为空
		if (user == null) {
			response.getWriter().print("用户名和密码不匹配");
			//增加自动跳转功能
			response.setHeader("refresh", "3;url=/firstproject2/index.html");
		} else {
			response.getWriter().print(user.getUsername() + ":欢迎回来");
			
			//获取全局管理者
			ServletContext context = this.getServletContext();
			//获取总此时
			Integer newCount = (Integer) context.getAttribute("count");
			//将次数+1
			newCount++;
			//将此书再次传入域对象中
			context.setAttribute("count", newCount);
		}
	}
}

package com.itcast.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 添加到购物车
 */
public class Add2CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		response.setContentType("text/html;charset=utf-8");
		PrintWriter w = response.getWriter();
		//获取商品名称
		String name = request.getParameter("name");
		name = new String(name.getBytes("iso8859-1"),"utf-8");
		//将商品添加购物车
		//从session获取购物车
		Map<String,Integer> map = (Map<String, Integer>) request.getSession().getAttribute("cart");
		
		//判断购物车是否为空
		Integer count = null;
		if(map == null) {
			//第一次购物，创建购物车
			map = new HashMap<>();
			
			//将购物车放入session中
			request.getSession().setAttribute("cart", map);
			
			count = 1;
		}else {
			//购物车不为空，判断购物车是否已经有该商品
			//获取商品数量
			count = map.get(name);
			if(count == null) {
				//购物车中没有该商品
				count = 1;
			}else {
				//购物车具有该商品
				count++;
			}
		}
		//将商品放入购物车
		map.put(name, count);
		//提示信息
		w.print("已经将<b>"+name+"</b>添加到购物车");
		w.print("<a href='"+request.getContextPath()+"/product_list.jsp'>继续购物</a>&nbsp;&nbsp;&nbsp;&nbsp;");
		w.print("<a href='"+request.getContextPath()+"/cart.jsp'>查看购物车</a>&nbsp;&nbsp;&nbsp;&nbsp;");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" width="88%">
		<tr>
			<td colspan="7">
				<form action="${pageContext.request.contextPath }/findProductByCondition" method="post">
					商品名称:<input name="name">&nbsp;&nbsp;&nbsp;&nbsp;关键词:<input name="kw">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="submit" value="查询">
				</form>
			</td>
			<td colspan="1" align="right">
				<input type="button" value="删除选中商品" onclick="delChecked()">
			</td>
		</tr>
		<tr>
			<td><input type="checkbox" onclick="checkAll(this)"></td>
			<th>pid</th>
			<th>商品图片</th>
			<th>商品名称</th>
			<th>市场价</th>
			<th>超市价</th>
			<th>商品描述</th>
			<th>操作</th>
		</tr>
		<form id="formId" action="${pageContext.request.contextPath }/deleteCheckedProduct" method="post">
			<c:forEach items="${list }" var="p">
				<tr>
					<td width="1%"><input type="checkbox" name="pid" value="${p.pid }"></td>
					<td width="8%">${p.pid }</td>
					<td width="8%"><img alt="" src="${pageContext.request.contextPath }/${p.pimage}" width="80"></td>
					<td width="8%">${p.pname }</td>
					<td width="8%">${p.market_price }</td>
					<td width="8%">${p.shop_price }</td>
					<td>${p.pdesc }</td>
					<td width="8%">
						<a href="${pageContext.request.contextPath }/getProductById?pid=${p.pid}">修改</a>
						|
						<a href="javascript:void(0)" onclick="deleteP('${p.pid}')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</form>
		
	</table>
</body>
<script type="text/javascript">
	function deleteP(obj){
		if(confirm("你真的不要我了吗")){
			location.href="${pageContext.request.contextPath }/deleteProductById?pid="+obj;
		}
	}
	
	function checkAll(obj){
		var arr=document.getElementsByName("pid");
		for(var i=0; i<arr.length; i++){
			arr[i].checked = obj.checked;
		}
	}
	
	function delChecked(){
		document.getElementById("formId").submit();
	}
</script>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login" method="post">
		用户名：<input name="name" value="admin" /> <br/>
		密码：<input name="password" value="123456" /><br/>
		<input type="submit" value="提交" />
	</form>

</body>
</html>
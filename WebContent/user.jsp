<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户</title>
</head>
<body>
<s:fielderror/>
<form enctype="multipart/form-data" action="${pageContext.request.contextPath }/register_update.action" method="post">
用户名：<input type="text" id="username" name="username"/><br>
密码：<input type="password" id="password" name="password"><br>
头像：<input type="file" id="face" name="face"><br>
<input type="file" id="face" name="face"><br>
<input type="file" id="face" name="face"><br>
<input type="submit" name="btnSubmit" value="保存"/><br>
【<a href="logout.jsp">退出</a>】
</form>
</body>
</html>
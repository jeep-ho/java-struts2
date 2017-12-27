<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>智慧机电运维平台--用户登录</title>
</head>
<body>
<form action="login.html" method="post">
<label>用户名：</label><input type="text" id="username" name="username"/>
<label>密码：</label><input type="password" id="password" name="password"/>
<label>验证码：</label><input type="text" id="code" name="code"/>
<input type="submit" id="btnSubmit" name="btnSubmit" value="登录"/>
</form>
</body>
</html>
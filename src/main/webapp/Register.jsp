<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="myaction">
        <s:textfield name="user.password" label="密码"></s:textfield>
        <s:textfield name="user.username" label="用户名"></s:textfield>
        <s:select list="#{'1':'男','0':'女'}" listKey="key" listValue="value"
            name="user.gender" label="性别" value="1"></s:select>  
        <s:submit value="注册"></s:submit>  
    </s:form> 
</body>
</html>
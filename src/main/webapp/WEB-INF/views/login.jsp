<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/25
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    
</head>
<body>
        <form action="/login" method="post">
            用户名<input type="text" name="username"/>
            <br/><br/>
            密码 <input type="text" name="password"/>
            <br/><br/>
            <input type="submit" value="登录"> <input type="button" value="注册" >
            <h1>${error}</h1>
        </form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/26
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
        <form action="/user/add" method="post">
            用户名<input type="text" value="username">
            <br/><br/>
            密码<input type="text" value="password">
            <br/><br/>
            <input type="submit" value="注册">
        </form>
</body>
</html>

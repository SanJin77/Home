<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/14
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <label>用户角色：</label>
    <select name="userRole" id="userRole">
        <option value="1">系统管理员</option>
        <option value="2">经理</option>
        <option value="3" selected="selected">普通用户</option>
    </select>
    <font color="red"></font>
    <%--@elvariable id="user" type=""--%>
    <fm:form method="post" modelAttribute="user">
        用户编码：<fm:input path="userCode"/><br/>
        用户名称：<fm:input path="userName"/><br/>
        用户密码：<fm:input path="password"/><br/>
        用户生日：<fm:input path="birthday" Class="Wdate" readonly="readonly"
        onclick="WdatePicker();"/><br/>
        用户地址：<fm:input path="address"/><br/>
        联系电话：<fm:input path="phone"/><br/>
        用户角色：
        <fm:radiobutton path="userRole" value="1"/>系统管理员
        <fm:radiobutton path="userRole" value="2"/>经理
        <fm:radiobutton path="userRole" value="3" checked="checked"/>普通用户<br/>
        <input type="submit" value="保存"/>
    </fm:form>
</body>
</html>

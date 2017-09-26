<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'main.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <script type="text/javascript">
        function queryUser() {
            //提交查询用户的form表单
            document.mainForm.action = "${pageContext.request.contextPath }/main/queryUser.action";
            document.mainForm.submit();
        }

        function deleteUser() {
            document.mainForm.action = "${pageContext.request.contextPath}/main/deleteUserById.action";
            document.mainForm.submit();
        }

        function updateUser() {
            document.mainForm.action = "${pageContext.request.contextPath}/main/updateUserById.action";
            document.mainForm.submit();
        }

        function addUser() {
            window.location.href = "addUser.jsp";
        }
    </script>
</head>

<body>
<h1>主界面</h1>
<form name="mainForm" action="${pageContext.request.contextPath}/main/queryUser.action" method="get">
    查询条件：
    <table width="100%" border="1">
        <tr>
            <td>
                用户名：<input type="text" name="userCustom.userName">
                <input type="submit" value="查询" onclick="queryUser()">
                <input type="button" value="添加用户" onclick="addUser()">
                <input type="button" value="批量删除" onclick="">
            </td>
        </tr>
    </table>
    用户列表：
    <table width="100%" border="1">
        <tr>
            <td>选择</td>
            <td>用户id</td>
            <td>用户名</td>
            <td>密码</td>
            <td>电话</td>
            <td>邮箱</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${userList }" var="user">
            <tr>
                <td><input type="checkbox" name="id" value="${user.id}"></td>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td>${user.phone}</td>
                <td>${user.userEmail}</td>
                <td><a href="${pageContext.request.contextPath}/main/editUser.action?id=${user.id}">修改</a>
                    <a href="${pageContext.request.contextPath}/main/deleteUserById.action?id=${user.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
</form>
</body>
</html>

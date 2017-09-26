<%--
  Created by IntelliJ IDEA.
  User: Silence
  Date: 2017/9/25
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Title</title>
    <%--不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题
        推荐以/开始为相对路径，找资源，以服务器的路径为基准
    --%>
    <script src="../../static/js/jquery-1.4.4.min.js"></script>
    <link href="../../static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <%--搭建显示页面--%>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h2>用户信息的增删改查</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 col-md-offset-8">
                <button class="btn btn-primary">新增</button>
                <button class="btn btn-success">删除</button>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-striped table-hover">
                    <tr>
                        <th>编号</th>
                        <th>姓名</th>
                        <th>密码</th>
                        <th>手机号</th>
                        <th>邮箱</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${pageInfo.list}" var="user">
                        <tr>
                            <th>${user.id}</th>
                            <th>${user.userName}</th>
                            <th>${user.password}</th>
                            <th>${user.phone}</th>
                            <th>${user.userEmail}</th>
                            <th>
                                <button class="btn btn-primary  btn-sm">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                    编辑</button>
                                <button class="btn-success  btn-sm">
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    删除</button>
                            </th>
                        </tr>
                    </c:forEach>


                </table>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                当前第${pageInfo.pageNum}页，总共${pageInfo.pages}页,总共${pageInfo.total}条数据
            </div>
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li><a href="${pageContext.request.contextPath}/main/users.action?page=1">首页</a></li>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <li>
                                <a href="${pageContext.request.contextPath}/main/users.action?page=${pageInfo.pageNum-1}" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                        </c:if>

                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                            <c:if test="${page_num == pageInfo.pageNum}">
                                <li class="active"><a href="#">${page_num}</a></li>
                            </c:if>
                            <c:if test="${page_num != pageInfo.pageNum}">
                                <li><a href="${pageContext.request.contextPath}/main/users.action?page=${page_num}">${page_num}</a></li>
                            </c:if>
                        </c:forEach>

                        <c:if test="${pageInfo.hasNextPage}">
                            <li>
                                <a href="${pageContext.request.contextPath}/main/users.action?page=${pageInfo.pageNum+1}" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </c:if>

                        <li><a href="${pageContext.request.contextPath}/main/users.action?page=${pageInfo.pages}">尾页</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</body>
</html>

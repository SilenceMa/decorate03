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
            <table class="table table-striped table-hover" id="user_table">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th>手机号</th>
                    <th>邮箱</th>
                    <th>操作</th>
                </tr>
                </thead>
                <%--这里显示用户信息--%>
                <tbody>

                </tbody>

            </table>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6" id="page_info_area">
        </div>
        <div class="col-md-6" id="page_nav_area">

        </div>
    </div>
</div>
<script type="text/javascript">

    //1页面加载完成以后，直接发送ajax请求，要到分页数据
    //首次进来加载首页数据
    $(function () {
        to_page(1)
    });

    function to_page(page) {
        $.ajax({
            url:"${pageContext.request.contextPath}/main/users.action",
            data:"page="+page,
            type:"get",
            success:function (result) {
                //1.解析并显示员工数据
                build_user_table(result);
                //2.解析并显示分页信息
                build_page_info(result)
                //3.解析显示分页条
                build_page_nav(result)
            }
        });
    }
    //员工数据
    function build_user_table(result) {
        //清空表格
        $("#user_table tbody").empty();
        var users = result.extend.pageInfo.list;
        $.each(users,function (index, item) {
           var user_id = $("<td></td>").append(item.id);
           var user_userName = $("<td></td>").append(item.userName);
           var user_password = $("<td></td>").append(item.password);
           var user_phone = $("<td></td>").append(item.phone);
           var user_userEmail = $("<td></td>").append(item.userEmail);
           var editBtn =$("<button></button>").addClass("btn btn-primary  btn-sm").append($("<span><span").addClass("glyphicon glyphicon-pencil")).append("编辑");
           var deleteBtn =$("<button></button>").addClass("btn btn-success  btn-sm").append($("<span><span").addClass("glyphicon glyphicon-trash")).append("删除");
           var btn = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
           $("<tr></tr>").append(user_id).append(user_userName).append(user_password).
            append(user_phone).append(user_userEmail).append(btn).appendTo("#user_table tbody");

        });
    }
    //分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前第"+result.extend.pageInfo.pageNum+"页",
            "总" +result.extend.pageInfo.pages+"共页","总共"+result.extend.pageInfo.total+"条数据")
    }

    //分页条page_nav_area,点击分页能够到下一页去
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var pageNums = result.extend.pageInfo.navigatepageNums;

        var ul = $("<ul></ul>").addClass("pagination");

        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));

        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));


        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else {
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum-1);
            });
        }
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));


        var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href","#"));

        if(result.extend.pageInfo.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else {
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum+1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }
        //添加首页和上一页
        ul.append(firstPageLi).append(prePageLi);
        $.each(pageNums,function (index,item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if(result.extend.pageInfo.pageNum == item){
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            })
            //添加页码
            ul.append(numLi);
        });
        //添加下一页和末页
        ul.append(nextPageLi).append(lastPageLi);
        
        //把ul添加到nav中
        var nav = $("<nav></nav>").append(ul);
        nav.appendTo("#page_nav_area");
    }

</script>
</body>
</html>

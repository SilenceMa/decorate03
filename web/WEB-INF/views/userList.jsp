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
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Title</title>
    <%--不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题
        推荐以/开始为相对路径，找资源，以服务器的路径为基准
    --%>
    <script src="../../static/js/jquery-3.2.1.min.js"></script>
    <link href="../../static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<%--员工修改的模态框--%>
<div class="modal fade" id="userUpdateModal" tabindex="-1" role="dialog" aria-labelledby="userUpdateModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">用户修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="user_update_form">
                    <div class="form-group">
                        <label for="userName" class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-6">
                            <p class="form-control-static" id="userName_update"></p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-6">
                            <input type="password" class="form-control" id="password_update" placeholder="密码"
                                   name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phone" class="col-sm-2 control-label">手机号</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="phone_update" placeholder="手机号" name="phone">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userEmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="userEmail_update" placeholder="邮箱"
                                   name="userEmail">
                            <span id="user_email_update_span" class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userProvince" class="col-sm-2 control-label">所在省份</label>
                        <div class="col-sm-6">
                            <%--这里只是示例--%>
                            <select class="form-control" id="userProvince" name="province">

                            </select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="user_update">更新</button>
            </div>
        </div>
    </div>
</div>

<!-- 员工添加的模态框  -->
<div class="modal fade" id="userAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">用户添加</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="user_info">
                    <div class="form-group">
                        <label for="userName" class="col-sm-2 control-label">姓名</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="userName" placeholder="姓名" name="userName">
                            <span id="user_name_span" class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-6">
                            <input type="password" class="form-control" id="password" placeholder="密码" name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="phone" class="col-sm-2 control-label">手机号</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="phone" placeholder="手机号" name="phone">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userEmail" class="col-sm-2 control-label">邮箱</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="userEmail" placeholder="邮箱" name="userEmail">
                            <span id="user_email_span" class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="userProvince" class="col-sm-2 control-label">所在省份</label>
                        <div class="col-sm-6">
                            <%--这里只是示例--%>
                            <select class="form-control" id="userProvince" name="province">

                            </select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="user_save">确定</button>
            </div>
        </div>
    </div>
</div>

<%--搭建显示页面--%>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h2>用户信息的增删改查</h2>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="user_add_modal_btn">新增</button>
            <button class="btn btn-success" id="user_delete_all_btn">删除</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-hover" id="user_table">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all">
                    </th>
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
    var totalRecord, currentPage;

    //1页面加载完成以后，直接发送ajax请求，要到分页数据
    //首次进来加载首页数据
    $(function () {
        to_page(1)
    });

    function to_page(page) {
        $.ajax({
            url: "${pageContext.request.contextPath}/main/users.action",
            data: "page=" + page,
            type: "get",
            success: function (result) {
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
        $.each(users, function (index, item) {
            var checkBox = $("<td><input type ='checkbox' class ='check_item'/></td>");
            var user_id = $("<td></td>").append(item.id);
            var user_userName = $("<td></td>").append(item.userName);
            var user_password = $("<td></td>").append(item.password);
            var user_phone = $("<td></td>").append(item.phone);
            var user_userEmail = $("<td></td>").append(item.userEmail);
            var editBtn = $("<button></button>").addClass("btn btn-primary  btn-sm edit_btn").append($("<span><span").addClass("glyphicon glyphicon-pencil")).append("编辑");
            editBtn.attr("user_id", item.id);
            var deleteBtn = $("<button></button>").addClass("btn btn-success  btn-sm delete_btn").append($("<span><span").addClass("glyphicon glyphicon-trash")).append("删除");
            deleteBtn.attr("delete_user_id", item.id);
            var btn = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
            $("<tr></tr>").append(checkBox).append(user_id).append(user_userName).append(user_password).append(user_phone).append(user_userEmail).append(btn).appendTo("#user_table tbody");

        });
    }

    //分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前第" + result.extend.pageInfo.pageNum + "页",
            "总" + result.extend.pageInfo.pages + "共页", "总共" + result.extend.pageInfo.total + "条数据");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    //分页条page_nav_area,点击分页能够到下一页去
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var pageNums = result.extend.pageInfo.navigatepageNums;

        var ul = $("<ul></ul>").addClass("pagination");

        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href", "#"));

        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));


        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));


        var lastPageLi = $("<li></li>").append($("<a></a>").append("尾页").attr("href", "#"));

        if (result.extend.pageInfo.hasNextPage == false) {
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }
        //添加首页和上一页
        ul.append(firstPageLi).append(prePageLi);
        $.each(pageNums, function (index, item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
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

    //点击新增按钮，弹出模态框
    $("#user_add_modal_btn").click(function () {
        //发送ajax请求，查出部门信息，显示在下拉列表中
        //getDepts()
        //弹出模态框,清除表单数据（表单重置 包括表单的数据 和表单的样式）
        reset_form("#user_info");
//        $("#user_info")[0].reset();
        $('#userAddModal').modal({
            backdrop: 'static'
        });
    });

    //表单重置的方法
    function reset_form(ele) {
        //清空表单数据
        $(ele)[0].reset();
        //清空表单样式
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }

    //查出所有的省份信息显示在下拉列表
    /**    function getDepts() {
        $.ajax({
            url:"/main/users.action",
            type:"get",
            success:function (result) {
                $("#userProvince").append("")
                $.each(result.extend.list.province,function () {
                    var option = $("<option></option>").append(this.province).attr("value",this.province);
                    option.appendTo("#userProvince");
                });
            }
        });
    }*/

    /**
     * 保存员工的方法
     * 前端校验 校验用户输入的用户名和邮箱是否正确
     */
    function validate_add_form() {
        //1.拿到需要校验的数据，使用正则表达式
        var user_name = $("#userName").val();
        var reg_user_name = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2e80-\u9fff]{2,8})/;
        if (!reg_user_name.test(user_name)) {
//            alert("请输入6-16位英文字符或2-8个中文字符");
            show_validate_msg("#userName", "error", "请输入6-16位英文字符或2-8个中文字符")

            return false;
        } else {
            show_validate_msg("#userName", "success", "");

        }
        var user_email = $("#userEmail").val();
        var reg_email = /^([a-zA-Z0-9_.-]+)@([\d a-z.-]+)\.([a-z.]{2,6})$/;
        if (!reg_email.test(user_email)) {
            //alert("您输入的邮箱号码不正确，请重新输入");
            show_validate_msg("#userEmail", "error", "您输入的邮箱格式不正确，请重新输入");

            return false;
        } else {
            show_validate_msg("#userEmail", "success", "");
        }
        return true;
        //
    }

    /**
     * 校验用户名是否存在
     */
    $("#userName").change(function () {
        //发送ajax请求校验用户名是否存在
        var userName = $("#userName").val();
        $.ajax({
            url: "${pageContext.request.contextPath}/main/checkUser.action",
            type: "post",
            data: "userName=" + userName,
            success: function (result) {
                if (result.status_code == "200") {
                    show_validate_msg("#userName", "success", "用户名可用");
                    $("#user_save").attr("ajax_result", "success");
                } else if (result.status_code == "201") {
                    show_validate_msg("#userName", "error", result.extend.va_msg);
                    $("#user_save").attr("ajax_result", "error");
                }
            }
        });
    });

    function show_validate_msg(ele, status, msg) {
        //清除当前元素的校验状态
        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if ("success" == status) {
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);
        } else if ("error" == status) {
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }

    $("#user_save").click(function () {
        //在这里需要进行员工数据的校验
        if (!validate_add_form()) {
            return false;
        }
        if ($("#user_save").attr("ajax_result") == "error") {
            return false;
        }
        //这里还需要进行用户名的校验如果成功了，再进行数据的添加

        //将模态框中的的数据保存到数据库
        $.ajax({
            url: "${pageContext.request.contextPath}/main/addUser.action",
            type: "post",
            data: $("#user_info").serialize(),
            success: function (result) {

                //alert(result.message);
                if (result.status_code == "200") {
                    $('#userAddModal').modal('hide');
                    //发送ajax请求
                    to_page(totalRecord);
                } else {
                    //显示失败信息
//                    console.log(result);
                    //有哪个字段的错误信息就显示哪个字段的错误信息
                    if (undefined != result.extend.errorFields.userEmail) {
                        //显示邮箱的错误信息
                        show_validate_msg("#userName", "error", result.extend.errorFields.userEmail)
                    }
                    if (undefined != result.extend.errorFields.userName) {
                        //显示用户名的错误信息
                        show_validate_msg("#userEmail", "error", result.extend.errorFields.userName)
                    }
                }

                //员工信息保存成功1.管理模态框2.显示保存的数据

            }
        });

    });
    //1.给编辑按钮绑定单击事件 1).可以在创建按钮的时候添加绑定事件 2)bind 绑定点击
    $(document).on("click", ".edit_btn", function () {
//        alert("edit");
        //点击编辑按钮，查询用户信息进行显示，然后弹出模态框
        //0.查询用户信息
        getUser($(".edit_btn").attr("user_id"));
        $('#userUpdateModal').attr("user_edit_id", $(".edit_btn").attr("user_id"));
        //1.弹出模态框
        $('#userUpdateModal').modal({
            backdrop: 'static'
        });
    });
    //2.单个删除员工信息
    $(Document).on("click", ".delete_btn", function () {
        //弹出确认对话框框
        var userName = $(".delete_btn").parents("tr").find("td:eq(2)").text;
        if (confirm("确认删除【" + userName + "】吗？")) {
            //点击确认删除即可
            $.ajax({
                url: "${pageContext.request.contextPath}/main/deleteUserById.action",
                data: "id+" + $(".deleteBtn").attr("delete_user_id"),
                type: "post",
                success:function (result) {
                    alert(result.message);
                    //回到本页
                    to_page(currentPage);
                }
            });
        }
    });

    //查询员工信息
    function getUser(id) {
        $.ajax({
            url: "${pageContext.request.contextPath}/main/getUser.action",
            data: "id=" + id,
            type: "get",
            success: function (result) {
                var user = result.extend.userInfo;
                $("#userName_update").text(user.userName);
                $("#password_update").val(user.password);
                $("#phone_update").val(user.phone);
                $("#userEmail_update").val(user.userEmail);
            }
        });
    }

    $("#user_update").click(function updateUser() {
        //校验邮箱
        var user_email = $("#userEmail_update").val();
        var reg_email = /^([a-zA-Z0-9_.-]+)@([\d a-z.-]+)\.([a-z.]{2,6})$/;
        if (!reg_email.test(user_email)) {
            //alert("您输入的邮箱号码不正确，请重新输入");
            show_validate_msg("#userEmail_update", "error", "您输入的邮箱格式不正确，请重新输入");
            return false;
        } else {
            show_validate_msg("#userEmail_update", "success", "");
        }
//        var userId = $('#userUpdateModal').attr("user_edit_id");
        //发送ajax请求，保存用户数据
        $.ajax({
            url: "${pageContext.request.contextPath}/main/userUpdate.action",
            data: "id=" + $('#userUpdateModal').attr("user_edit_id") + "&" + $("#user_update_form").serialize(),
            type: "post",
            success: function (result) {
//                    alert("ssss");
                //关闭对话框框回到本页
                $('#userUpdateModal').modal('hide');
                //回到本页面
                to_page(currentPage);
            }

        });
        return true;

    })
    //完成全选全不选
    $("#check_all").click(function () {
//        alert($("#check_all").prop("checked"));
        $(".check_item").prop("checked",$("#check_all").prop("checked"));
    });

    $(document).on("click",".check_item",function () {
       //判断当前选中的元素是否为5个
        var flag = $(".check_item:checked").length == $(".check_item").length;
        $("#check_all").prop("checked",flag);
    });
    //全选删除
    $("#user_delete_all_btn").click(function () {
        var  users = "";
        $.each2($(".check_item:checked"),function () {
            users += $(".check_item").parents("tr").find("td:eq(2)").text() +",";
        });
        users.substr(0,users.length-1);
        if (confirm("确认删除【" + users + "】吗？")){
            //发送ajax请求

        }
    });
</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>

</head>
<body>
	<!-- 显示错误信息 -->
	<c:if test="${errors!=null}">
		<c:forEach items="${errors}" var="error">
	${error.defaultMessage}
</c:forEach>
	</c:if>

	<form id="userForm"
		action="${pageContext.request.contextPath }/main/updateUserById.action"
		method="post">
		<input type="hidden" name="id" value="${userCustom.id }" /> 修改用户信息：
		<table width="100%" border=1>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="userName"
					value="${userCustom.userName }" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password"
					value="${userCustom.password }" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone" value="${userCustom.phone}" /></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="userEmail"
					value="${userCustom.userEmail}" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
</body>

</html>
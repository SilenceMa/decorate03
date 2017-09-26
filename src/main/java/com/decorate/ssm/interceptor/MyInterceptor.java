package com.decorate.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.decorate.ssm.utils.Constant;

public class MyInterceptor implements HandlerInterceptor {

	// 进入handler方法之前
	// 用于身份认证、身份授权，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		// 获取用户请求的地址
		String url = request.getRequestURI();

		if (url.indexOf(Constant.LOGIN_URL) >= 0) {
			return true;
		}
		//获取session
		HttpSession session = request.getSession();
		String phone = (String) session.getAttribute("phone");
		if (phone != null) {
			// 身份存在，放行
			return true;
		}
		// 如果身份认证不通过，那么返回登录界面进行登陆
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		return false;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception exception) throws Exception {

	}

}

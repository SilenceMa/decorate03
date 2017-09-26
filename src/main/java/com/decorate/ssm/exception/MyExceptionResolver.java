package com.decorate.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局的异常处理，当出现异常后进入error界面
 * @author Silence
 *
 */
public class MyExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) {
		
		//handler就是处理器适配器要执行handler对象（只有method方法）
		//解析出异常
		MyException ex =null;
		//如果是自定义的异常那么取出异常，在错误页面显示
		if (ex instanceof MyException) {
			ex = (MyException)exception;
			
		}else {
			//如果不是系统自定义的异常，构造一个自定义的异常类型
			ex = new MyException("未知错误，请联系管理员进行处理");
		}
		
		String message = ex.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "message");
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}

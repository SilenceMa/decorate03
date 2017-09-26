package com.decorate.ssm.controller;

import javax.servlet.http.HttpSession;

import com.decorate.ssm.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.decorate.ssm.po.User;

/**
 * 登录的控制器
 * 
 * @author Silence
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginServiceImpl loginService;

	@RequestMapping("/login")
	public String login(HttpSession session, String phone, String password) throws Exception {
		User user = new User();
		user.setPhone(phone);
		user.setPassword(password);
		int isToLogin;
		try {
			isToLogin = loginService.findUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return "/login";
		}

		if (isToLogin == 1) {
			session.setAttribute("phone", phone);
			return "redirect:/main/users.action";
		}

		return "/login";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "/login";
	}
}

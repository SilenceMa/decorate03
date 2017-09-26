package com.decorate.ssm.service;

import com.decorate.ssm.po.User;

public interface LoginService {
	//查询用户信息登录
	int findUser(User user) throws Exception;
}

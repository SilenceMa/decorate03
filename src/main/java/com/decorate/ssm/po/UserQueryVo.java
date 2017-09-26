package com.decorate.ssm.po;

import java.util.List;

public class UserQueryVo {
	private User user;

	private List<UserCustom> userCustoms;

	private UserCustom userCustom;
	
	public List<UserCustom> getUserCustoms() {
		return userCustoms;
	}

	public void setUserCustoms(List<UserCustom> userCustoms) {
		this.userCustoms = userCustoms;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}

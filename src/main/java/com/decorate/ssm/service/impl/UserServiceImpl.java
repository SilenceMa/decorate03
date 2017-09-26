package com.decorate.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.decorate.ssm.mapper.UserListMapper;
import com.decorate.ssm.mapper.UserMapper;
import com.decorate.ssm.po.User;
import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;
import com.decorate.ssm.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserListMapper userListMapper;

	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
		return userListMapper.findUserList(userQueryVo);
	}

	@Override
	public void deleteUser(Integer id) throws Exception {
		
		int count ;
		if (id!=null) {
			count = userMapper.deleteByPrimaryKey(id);
			System.out.println("成功删除了" +count +"行数据");
		}
	}

	@Override
	public void deleteUser(List<Integer> idList) throws Exception {
		
	}

	@Override
	public void updateUser(List<Integer> idList, List<User> userList) throws Exception {
		
	}

	@Override
	public void updateUser(Integer id, UserCustom userCustom) throws Exception {
		
		if (userCustom != null && id != null) {
			userCustom.setId(id);
			int count = userMapper.updateByPrimaryKey(userCustom);
			System.out.println("成功修改了" +count +"个用户的信息");
		}
		
	}

	/**
	 * 插入用户信息
	 */
	@Override
	public void addUser(User user) throws Exception {
		if (user!=null) {
			int count = userMapper.insertSelective(user);
			System.out.println("成功插入" + count + "个用户");
		}
	}

	/**
	 * 根据id查询用户信息
	 */
	@Override
	public UserCustom findUserById(Integer id) throws Exception {
		User user = userMapper.selectByPrimaryKey(id);
		UserCustom userCustom = new UserCustom();
		BeanUtils.copyProperties(user, userCustom);
		return userCustom;
		
	}

}

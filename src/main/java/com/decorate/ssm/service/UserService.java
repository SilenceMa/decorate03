package com.decorate.ssm.service;

import java.util.List;

import com.decorate.ssm.po.User;
import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;

public interface UserService {
	/**
	 * 
	 * @param user 查询条件
	 * @return 用户列表
	 * @throws Exception
	 */
	List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	/**
	 * 根据id删除用户信息
	 * @param id 用户id
	 * @throws Exception
	 */
	void deleteUser(Integer id) throws Exception;
	
	/**
	 * 批量删除用户信息
	 * @param idList 用户id列表
	 * @throws Exception
	 */
	void deleteUser(List<Integer> idList) throws Exception;
	
	/**
	 * 批量修改用户信息
	 * @param userList 用户信息集合
	 * @throws Exception
	 */
	void updateUser(List<Integer> idList, List<User> userList) throws Exception;
	
	/**
	 * 根据id修改用户信息
	 * @param id 用户id
	 * @param user 用户信息
	 * @throws Exception
	 */
	void updateUser(Integer id, UserCustom userCustom) throws Exception;
	
	/**
	 * 添加用户信息
	 * @param 用户信息
	 */
	void addUser(User user) throws Exception;
	
	/**
	 * 
	 * @param id 从主界面传递过来的用户id
	 * @throws Exception
	 */
	UserCustom findUserById(Integer id) throws Exception;

	boolean checkUser(String userName) throws Exception;

	void updateUserInfo(Integer id, User user) throws Exception;
}

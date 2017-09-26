package com.decorate.ssm.controller;

import java.security.MessageDigest;
import java.util.List;

import com.decorate.ssm.utils.DecorateMessage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.decorate.ssm.po.User;
import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;
import com.decorate.ssm.service.UserService;

/**
 * 主界面，用来进行用户信息的查看，添加、删除
 * @author Silence
 *
 */
@Controller
@RequestMapping("/main")
public class UserController {
	
	@Autowired
	UserService userService;


	//查询用户信息
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(UserQueryVo userQueryVo) throws Exception{
		/**
		 * 这不是一个分页查询
		 */
		List<UserCustom> userList = userService.findUserList(userQueryVo);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		modelAndView.setViewName("/main");
		
//		model.addAttribute("userList", userList);
//		return "/main/main";
		return modelAndView;
	}
	//@RequestMapping("/users")
	public String users(Model model,@RequestParam(value = "page",defaultValue = "1")Integer page) throws Exception{
		/**
		 * 利用pagehelper分页查询，在查询前需要传入页码以及每页的大小
		 */
		PageHelper.startPage(page,10);
		//startpage紧跟的查询就是一个分页查询
		List<UserCustom> users = userService.findUserList(null);
		//连续显示五页

		PageInfo pageInfo = new PageInfo(users,5);
		//使用pageInfo包装查询后的对象，只需要将pageInfo交给页面就可以了
		//pageInfo中封装了分页的详细信息，包括查询出来的详细信息
		model.addAttribute("pageInfo",pageInfo);
		return "/userList";
	}
	@RequestMapping("/users")
	@ResponseBody
	public DecorateMessage getUserWithJson(@RequestParam(value = "page",defaultValue = "1")Integer page) throws Exception{
		//使用pageHelper传入页码以及每页大小（10条数据）
		PageHelper.startPage(page,10);
		//将用户数据查询出来
		List<UserCustom> userCustomList = userService.findUserList(null);
		//将查询出来的数据装入pageinfo中，并设置连续要显示的页数为5页
		PageInfo pageInfo = new PageInfo(userCustomList,5);
		//将查询出来的数据以json字符串的形式进行返回
		return DecorateMessage.success().add("pageInfo",pageInfo);
	}
	//根据id删除用户信息
	@RequestMapping("/deleteUserById")
	public String deleteUserById(@RequestParam(value="id",required = true,defaultValue="0") Integer user_id) throws Exception{
		try {
			userService.deleteUser(user_id);
		} catch (Exception e) {
			e.printStackTrace();
			return "/error";
		}
		return "/success";
	}
	
	//批量删除用户信息
	@RequestMapping("/deleteUserByIdList")
	public String deleteUserByIdList() throws Exception{
		return "/success";
	}
	
	//添加用户信息
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	@ResponseBody
	public DecorateMessage addUser(User user) throws Exception{
		userService.addUser(user);
		return DecorateMessage.success();
	}
	
	//根据id查询用户信息
	@RequestMapping("editUser")
	public String editUser(Model model ,Integer id) throws Exception{
		UserCustom userCustom = null;
		if (id!=null) {
		userCustom = userService.findUserById(id);
		model.addAttribute("userCustom", userCustom);
		}
		return "/main/editUser";
	}
	
	//根据用户id修改用户信息
	@RequestMapping("/updateUserById")
	public String updateUserById(Integer id,UserCustom userCustom) throws Exception{
		userService.updateUser(id, userCustom);
		return "/success";
	}
	
	@RequestMapping("/resultJson/{id}")
	public @ResponseBody UserCustom resultJson(@PathVariable("id") Integer id) throws Exception{
		UserCustom userCustom = userService.findUserById(id);
		return userCustom;
	}

	/**
	 * 检查用户名是否可用
	 * @param userName 页面传过来的用户名
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/checkUser",method = RequestMethod.POST)
	@ResponseBody
	public DecorateMessage checkUser(String userName) throws Exception{
		boolean b = userService.checkUser(userName);
		if (b){
			return DecorateMessage.success();
		}else {
			return DecorateMessage.fail();
		}

	}
	
}

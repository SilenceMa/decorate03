package com.decorate.ssm.mapper;

import java.util.List;

import com.decorate.ssm.po.UserCustom;
import com.decorate.ssm.po.UserQueryVo;
import org.springframework.stereotype.Repository;
@Repository
public interface UserListMapper {
	List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
}

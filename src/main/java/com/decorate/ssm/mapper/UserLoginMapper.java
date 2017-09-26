package com.decorate.ssm.mapper;

import com.decorate.ssm.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginMapper {
	int findLoginUser(User user) throws Exception;
}

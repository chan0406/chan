package com.jt.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jt.pojo.User;

public interface UserMapper extends BaseMapper<User>{

	int selectCount(QueryWrapper<org.springframework.boot.autoconfigure.security.SecurityProperties.User> queryWrapper);
	
}

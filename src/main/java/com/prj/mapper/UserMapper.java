package com.prj.mapper;

import com.prj.common.core.domain.entity.User;


public interface UserMapper
{
    public User selectUserByUserName(String userName);
}

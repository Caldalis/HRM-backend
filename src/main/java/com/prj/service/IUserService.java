package com.prj.service;

import com.prj.common.core.domain.entity.User;


public interface IUserService
{
    public User selectUserByUserName(String userName);
}

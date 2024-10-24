package com.prj.common.exception.user;

public class UserPasswordNotMatchException extends UserException
{
    public UserPasswordNotMatchException()
    {
        super("密码不匹配");
    }
}

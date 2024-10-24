package com.prj.common.exception.user;

public class CaptchaException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("验证码错误");
    }
}

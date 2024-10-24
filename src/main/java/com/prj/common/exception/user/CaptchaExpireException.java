package com.prj.common.exception.user;

public class CaptchaExpireException extends UserException
{
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("验证码已失效");
    }
}

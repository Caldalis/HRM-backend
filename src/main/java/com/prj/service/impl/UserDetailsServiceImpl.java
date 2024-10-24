package com.prj.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.prj.common.core.domain.entity.User;
import com.prj.common.core.domain.model.LoginUser;
import com.prj.common.exception.ServiceException;
import com.prj.service.IUserService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private static final Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.selectUserByUserName(username);
        if (user == null) {
            log.info("用户：{} 不存在.", username);
            throw new ServiceException("用户：" + username + " 不存在");
        }

        return createLoginUser(user);
    }

    public UserDetails createLoginUser(User user) {
        return new LoginUser(user.getUserId(), user);
    }
}

/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.impl;

import com.csy.dao.user.UserDao;
import com.csy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:49 $
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean login(String username, String password) {
        return userDao.login(username, password);
    }
}

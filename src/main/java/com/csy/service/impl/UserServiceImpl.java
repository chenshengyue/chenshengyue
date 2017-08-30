/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service.impl;

import com.csy.dao.user.UserDao;
import com.csy.model.user.User;
import com.csy.model.user.UserAuthRo;
import com.csy.model.user.UserConditions;
import com.csy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:49 $
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password) {
        return userDao.login(username, password);
    }

    @Override
    public User getByUsername(String username) {
        UserConditions conditions = new UserConditions();
        conditions.createCriteria().andUsernameEqualTo(username);
        List<User> list = userDao.getByExample(conditions);
        if (list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    @Override
    public UserAuthRo getUserAuthByUserId(Integer id) {
        return userDao.getUserAuthByUserId(id);
    }
}

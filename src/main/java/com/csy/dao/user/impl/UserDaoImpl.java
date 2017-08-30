/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.dao.user.impl;

import com.csy.dao.mapper.user.UserMapper;
import com.csy.dao.user.UserDao;
import com.csy.model.user.User;
import com.csy.model.user.UserAuthRo;
import com.csy.model.user.UserConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:54 $
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserMapper userMapper;

    public User login(String username, String password) {
        UserConditions conditions = new UserConditions();
        conditions.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(conditions);
        if (list != null && list.size() > 0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public UserAuthRo getUserAuthByUserId(Integer id) {
        UserAuthRo userAuthRo = userMapper.getUserAuthByUserId(id);
        return userAuthRo;
    }

    @Override
    public List<User> getByExample(UserConditions conditions) {
        List<User> list = userMapper.selectByExample(conditions);
        return list;
    }
}

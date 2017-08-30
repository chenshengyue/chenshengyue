/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.dao.user;

import com.csy.model.user.User;
import com.csy.model.user.UserAuthRo;
import com.csy.model.user.UserConditions;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:51 $
 */

public interface UserDao {

    User login(String username, String password);

    UserAuthRo getUserAuthByUserId(Integer id);

    List<User> getByExample(UserConditions conditions);
}

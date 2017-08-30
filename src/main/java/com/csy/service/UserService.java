/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.csy.service;

import com.csy.model.user.User;
import com.csy.model.user.UserAuthRo;

import java.util.List;

/**
 * @author chenshengyue
 * @since $Revision:1.0.0, $Date: 2017/8/8 9:47 $
 */

public interface UserService {

    User login(String username, String password);

    User getByUsername(String username);

    UserAuthRo getUserAuthByUserId(Integer id);

}
